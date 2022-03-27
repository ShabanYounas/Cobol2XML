/*
 * @(#)XMLPayload.java	 0.1.0
 *
 * Copyright (c) 2019 Julian M. Bass
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 */package xmlwriter;


 import cobol.*;

 import javax.xml.parsers.DocumentBuilderFactory;
 import java.io.File;
 import java.io.StringWriter;

 import javax.xml.XMLConstants;
 import javax.xml.parsers.DocumentBuilder;
 import javax.xml.transform.OutputKeys;
 import javax.xml.transform.Transformer;
 import javax.xml.transform.TransformerFactory;
 import javax.xml.transform.dom.DOMSource;
 import javax.xml.transform.stream.StreamResult;

 import org.w3c.dom.Document;
 import org.w3c.dom.Element;
 import org.w3c.dom.Attr;

 import java.util.logging.Logger;




 public class XMLPayload {
	 Document doc;
	 Element rootElement;
	 private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	 public XMLPayload() {
		 try {
			 DocumentBuilderFactory dbFactory =
					 DocumentBuilderFactory.newInstance();
			 dbFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, ""); // XML parsers should not be vulnerable to XXE attacks
			 dbFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, ""); // XML parsers should not be vulnerable to XXE attacks
			 DocumentBuilder dBuilder = 
					 dbFactory.newDocumentBuilder();
			 doc = dBuilder.newDocument();

			 // root element
			 rootElement = doc.createElement("cobol");
			 doc.appendChild(rootElement);

		 } catch (Exception e) {
			 e.printStackTrace();
		 }

	 }


	 public void addElements(Cobol c) {
		 /*
		  *  add sectionName element
		  */	
		 int yearDateWritten = c.getYearDateWritten();
		 if(yearDateWritten != 0) {
			 this.addYearDateWrittenElement( yearDateWritten );
		 }		
		 String commentLine = c.getCommentLine();
		 if (commentLine != null) {
			 this.addCommentLineElement( commentLine );
		 }
		 String accept = c.getAccept();
		 if(accept != null) {
			 this.addAcceptElement(accept);
		 }
		 String constantName = c.getConstantName();
		 if (constantName != null) {
			 this.addConstantValueElement( constantName, 
					 c.getConstantValue(), c.getLineNumber() );
		 } 
		 String divisionName = c.getDivisionName();
		 if (divisionName != null) {
			 this.addDivisionElement( divisionName );
 } 
 String programIDName = c.getProgram_ID();
		 if (programIDName != null) {
			 this.addProgram_IDElement( programIDName );
			 } 


		 String mainLogic = c.getMainLogic();
		 if (mainLogic != null) {
			 this.addMainLogicElement( mainLogic); 
			 //					 c.getDisplayBase(),
			 //
			 //					 c.getPerform(), 
			 //
			 //					 c.getThrough(), 
			 //
			 //					 c.getAccept());
		 }

		 String displayBase = c.getDisplayBase();
		 if (displayBase != null) {
			 this.addDisplayBaseElement( displayBase );
		 }

		 String perform = c.getPerform();
		 if (perform != null) {
			 this.addPerformElement( perform );
		 }

		 String through = c.getThrough();
		 if (through != null) {
			 this.addThroughElement( through );
		 }

//		 String hexData = c.getHexData();
//		 if (through != null) {
//			 this.addHexElement( hexData );
//		 }

		 String decimalBase = c.getDecimalBase();
		 if (decimalBase != null ) {
			 this.addDecimalBaseElement( decimalBase );
			 }
		 
		 String move = c.getMove();
		 if (move != null ) {
			 this.addMoveElement( move );
			 }
		 String to = c.getTo();
		 if (to != null ) {
			 this.addToElement( to );
			 }
		 String divide = c.getDivide();
		 if (divide != null ) {
			 this.addDivideElement( divide );
			 }
		 String search = c.getSearch();
		 if (search != null ) {
			 this.addSearchElement( search );
			 }
		 String wNumber = c.getwNumber();
		 if (wNumber != null ) {
			 this.addWNumberElement( wNumber );
			 }
		 String at = c.getAt();
		 if (at != null ) {
			 this.addAtElement( at );
			 }
		 String when = c.getWhen();
		 if (when != null ) {
			 this.addWhenElement( when );
			 }
//		 String is = c.getIs();
//		 if (is != null ) {
//			 this.addIsElement( is );
//			 }
		 
		 /*
		  *  add DateWritten element
		  */	
		 // DayDateWritten
		 int dayDateWritten = c.getDayDateWritten();
		 if(dayDateWritten != 0) {
			 this.addDayDateWrittenElement( dayDateWritten );
		 }

		 //MonthDateWritten
		 String monthDateWritten = c.getMonthDateWritten();
		 if (monthDateWritten != null) {
			 this.addMonthDateWrittenElement( monthDateWritten );
		 }
	 }


//	   void addIsElement(String stringElement) {
//		// TODO Auto-generated method stub
//		   if(stringElement != null) {
//				 Element cobolname = doc.createElement("Is");
//				 cobolname.appendChild( doc.createTextNode(stringElement));
//				 rootElement.appendChild(cobolname);
//			 }
//	}


	void addWhenElement(String stringElement) {
		// TODO Auto-generated method stub
		  if(stringElement != null) {
				 Element cobolname = doc.createElement("When");
				 cobolname.appendChild(doc.createTextNode(stringElement));
				 rootElement.appendChild(cobolname);
			 }
	}


	void addAtElement(String stringElement) {
		// TODO Auto-generated method stub
		 if(stringElement != null) {
			 Element cobolname = doc.createElement("At");
			 cobolname.appendChild(doc.createTextNode(stringElement));
			 rootElement.appendChild(cobolname);
		 }
	}


	void addWNumberElement(String stringElement) {
		// TODO Auto-generated method stub
		  if(stringElement != null) {
				 Element cobolname = doc.createElement("w_number");
				 cobolname.appendChild(doc.createTextNode(stringElement));
				 rootElement.appendChild(cobolname);
			 }
	}


	void addSearchElement(String stringElement) {
		// TODO Auto-generated method stub
		 if(stringElement != null) {
			 Element cobolname = doc.createElement("Search");
			 cobolname.appendChild(doc.createTextNode(stringElement));
			 rootElement.appendChild(cobolname);
		 }
	}


	void addDivideElement(String stringElement) {
		// TODO Auto-generated method stub
		if(stringElement != null) {
			 Element cobolname = doc.createElement("Divide");
			 cobolname.appendChild(doc.createTextNode(stringElement));
			 rootElement.appendChild(cobolname);
		 }
	}


	void addDecimalBaseElement(String stringElement) {
		// TODO Auto-generated method stub
		 if(stringElement != null) {
			 Element cobolname = doc.createElement("Decimal_To_Base");
			 cobolname.appendChild(doc.createTextNode(stringElement));
			 rootElement.appendChild(cobolname);
		 }
	}
	void addMoveElement(String stringElement) {
		// TODO Auto-generated method stub
		 if(stringElement != null) {
			 Element cobolname = doc.createElement("Move");
			 cobolname.appendChild(doc.createTextNode(stringElement));
			 rootElement.appendChild(cobolname);
		 }
	}
	void addToElement(String stringElement) {
		// TODO Auto-generated method stub
		 if(stringElement != null) {
			 Element cobolname = doc.createElement("To");
			 cobolname.appendChild(doc.createTextNode(stringElement));
			 rootElement.appendChild(cobolname);
		 }
	}


//	void addHexElement(String stringElement) {
//		 // TODO Auto-generated method stub
//		 if(stringElement != null) {
//			 Element cobolname = doc.createElement("Hexadecimal");
//			 cobolname.appendChild(doc.createTextNode(stringElement));
//			 rootElement.appendChild(cobolname);
//
//		 }

//	 }


	 //		 String workignStorageSection = c.getWorkignStorageSection();
	 //					 if (workignStorageSection != null) {
	 //						 this.addWorkingStorageSectionElement( workignStorageSection );
	 //			 } 
	 //
	 //	 }




	 void addWorkingStorageSectionElement(String stringElement) {
		 // TODO Auto-generated method stub
		 if(stringElement != null) {
			 Element cobolname = doc.createElement("Working-Storage");
			 cobolname.appendChild(doc.createTextNode(stringElement));
			 rootElement.appendChild(cobolname);
		 }
	 }


	 void addThroughElement(String stringElement) {
		 // TODO Auto-generated method stub
		 if(stringElement != null) {
			 Element cobolname = doc.createElement("thru");

			 cobolname.appendChild(doc.createTextNode(stringElement));
			 rootElement.appendChild(cobolname);
		 }
	 }


	 void addAcceptElement(String stringElement) {
		 // TODO Auto-generated method stub
		 if(stringElement != null) {
			 Element cobolname = doc.createElement("Accept");
			 cobolname.appendChild(doc.createTextNode(stringElement));
			 rootElement.appendChild(cobolname);

		 }
	 }


	 void addPerformElement(String stringElement) {
		 // TODO Auto-generated method stub
		 if(stringElement != null) {
			 Element cobolname = doc.createElement("Perform");
			 cobolname.appendChild(doc.createTextNode(stringElement));
			 rootElement.appendChild(cobolname);

		 }
	 }


	 void addMainLogicElement(String mainLogic) {
		 //	 , String displayBase, String perform ,
		 //	 String through, String accept) {

		 if(mainLogic != null) {
			 Element cobolname = doc.createElement("Main-Logic");
			 cobolname.appendChild(doc.createTextNode(mainLogic));
			 rootElement.appendChild(cobolname);

			 //		 if(mainLogic != null) {
			 //			 Element x = doc.createElement("Main-Logic");
			 //			 // insert name of constant into XML file
			 //			 Element y = doc.createElement(mainLogic);
			 //
			 //
			 //			 // insert value of constant into XML file
			 //			 Element c = doc.createElement(mainLogic);
			 //			 Attr d = doc.createAttribute("Display" );
			 //			 d.setValue( displayBase );
			 //			 c.setAttributeNode(d);
			 //			 x.appendChild(c);
			 //			 rootElement.appendChild(x);
			 //
			 //			 Element u = doc.createElement(mainLogic);
			 //			 Attr v = doc.createAttribute("Accept" );
			 //			 v.setValue( accept );
			 //			 u.setAttributeNode(v);
			 //			 x.appendChild(u);
			 //			 rootElement.appendChild(x);
			 //
			 //
			 //			 Element e = doc.createElement(mainLogic);
			 //			 Attr f = doc.createAttribute("Perform" );
			 //			 f.setValue(perform);
			 //			 e.setAttributeNode(f);
			 //			 x.appendChild(e);
			 //			 rootElement.appendChild(x);
			 //
			 //			 Element g = doc.createElement(mainLogic);
			 //			 Attr h = doc.createAttribute("thru" );
			 //			 h.setValue(through);
			 //			 g.setAttributeNode(h);
			 //			 x.appendChild(g);
			 //			 rootElement.appendChild(x);


		 }
	 }


	 void addDisplayBaseElement(String stringElement) {
		 if(stringElement != null) {
			 Element cobolname = doc.createElement("Display" );
			 cobolname.appendChild(doc.createTextNode(stringElement));
			 rootElement.appendChild(cobolname);
		 }
	 }







	 void addConstantValueElement(String constantName, double constantValue, int lineNumber) {
		 // TODO Auto-generated method stub

		 if(constantName != null) {

			 Element cobolname = doc.createElement("Constant");
			 // insert name of constant into XML file
			 Element constID = doc.createElement("Constant");
			 Attr attrType2 = doc.createAttribute("Name" );
			 attrType2.setValue( constantName );
			 constID.setAttributeNode(attrType2);
			 cobolname.appendChild(constID);


			 // insert line number of constant into XML file
			 Element lineID = doc.createElement(constantName);
			 Attr attrType = doc.createAttribute("Line_Number" );
			 attrType.setValue( Integer.toString(lineNumber) );
			 lineID.setAttributeNode(attrType);
			 cobolname.appendChild(lineID);
			 // insert value of constant into XML file
			 Element constantID = doc.createElement(constantName);
			 Attr attrType1 = doc.createAttribute("Value" );
			 attrType1.setValue( Double.toString(constantValue) );
			 constantID.setAttributeNode(attrType1);
			 cobolname.appendChild(constantID);
			 rootElement.appendChild(cobolname);
		 }

	 }


	 void addProgram_IDElement(String stringElement) {
		 //  Program ID element

		 if(stringElement != null) {
			 Element cobolname = doc.createElement("Program-ID");
			 cobolname.appendChild(doc.createTextNode(stringElement));
			 rootElement.appendChild(cobolname);
		 }
	 }

	 void addCommentLineElement(String stringElement) {
		 //  Comment Line element

		 if(stringElement != null) {
			 Element cobolname = doc.createElement("comment");
			 cobolname.appendChild(doc.createTextNode(stringElement));
			 rootElement.appendChild(cobolname);
		 }
	 }



	 void addSectionElement(String stringElement) {
		 //  Section element

		 if(stringElement != null) {
			 Element cobolname = doc.createElement("section");
			 cobolname.appendChild(doc.createTextNode(stringElement));
			 rootElement.appendChild(cobolname);
		 }
	 }

	 void addDivisionElement(String stringElement) {
		 //  Division element
		 if(stringElement != null) {
			 Element cobolname = doc.createElement("division");
			 cobolname.appendChild(doc.createTextNode(stringElement));
			 rootElement.appendChild(cobolname);
		 }
	 }

	 void addDayDateWrittenElement(int intElement) {
		 //  DayDateWritten element

		 if(intElement != 0) {
			 Element cobolname = doc.createElement("day-date-written");
			 String s = "" + intElement;
			 cobolname.appendChild(doc.createTextNode(s));
			 rootElement.appendChild(cobolname);
		 }
	 }

	 void addMonthDateWrittenElement(String stringElement) {
		 //  MonthWritten element

		 if(stringElement != null) {
			 Element cobolname = doc.createElement("month-date-written");
			 cobolname.appendChild(doc.createTextNode(stringElement));
			 rootElement.appendChild(cobolname);
		 }
	 }

	 void addYearDateWrittenElement(int intElement) {
		 //  YearDateWritten element

		 if(intElement != 0) {
			 Element cobolname = doc.createElement("year-date-written");
			 String s = "" + intElement;
			 cobolname.appendChild(doc.createTextNode(s));
			 rootElement.appendChild(cobolname);
		 }
	 }

	 public void writeFile(String filename) {
		 try {
			 // write the content into xml file
			 // insert debug printf "WriteFile Filename: " + filename
			 TransformerFactory transformerFactory = TransformerFactory.newInstance();
			 transformerFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, ""); // XML parsers should not be vulnerable to XXE attacks
			 transformerFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_STYLESHEET, ""); // XML parsers should not be vulnerable to XXE attacks
			 Transformer transformer = transformerFactory.newTransformer();
			 transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			 transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			 DOMSource source = new DOMSource(doc);

			 StreamResult result = new StreamResult(new File(filename));
			 transformer.transform(source, result);

			 // Output to console for testing
			 StreamResult consoleResult = new StreamResult(System.out);
			 transformer.transform(source, consoleResult);

			 //A character stream that collects its output in a string buffer, 
			 //which can then be used to construct a string.
			 StringWriter writer = new StringWriter();

			 //transform document to string 
			 transformer.transform(source, new StreamResult(writer));

			 String xmlString = writer.getBuffer().toString();
			 LOGGER.info(xmlString);
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
	 }

 }
 /**
 // void addMainLogicElement(String mainLogic, String perform, String innerMainLogic) {
 //		// TODO Auto-generated method stub
 //	if(mainLogic != null) {
 //		 Element cobolname = doc.createElement("Main-Logic");
 //		 // insert name of constant into XML file
 //		 Element constID = doc.createElement("main-logic");
 //		 Attr attrType2 = doc.createAttribute("element" );
 //		 attrType2.setValue( mainLogic );
 //		 constID.setAttributeNode(attrType2);
 //		 cobolname.appendChild(constID);
 //		 
 //		 
 //		 // insert line number of constant into XML file
 //		 Element lineID = doc.createElement(mainLogic);
 //		 Attr attrType = doc.createAttribute("Display" );
 //		 attrType.setValue( innerMainLogic);
 //		 lineID.setAttributeNode(attrType);
 //		 cobolname.appendChild(lineID);
 //		 // insert value of constant into XML file
 //		 Element constantID = doc.createElement(mainLogic);
 //		 Attr attrType1 = doc.createAttribute(addPerformElement("Perform" ));
 //		 attrType1.setValue (perform );
 //		 constantID.setAttributeNode(attrType1);
 //		 cobolname.appendChild(constantID);
 //		 rootElement.appendChild(cobolname);
 //	 }
 //	}*/