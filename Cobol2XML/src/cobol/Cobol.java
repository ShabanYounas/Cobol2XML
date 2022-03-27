/*
 * @(#)Cobol.java	 0.0.1
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
 */

package cobol;

import utensil.*;

public class Cobol implements PubliclyCloneable {
	protected String commentLine;
	protected String program_id;
	protected String sectionName;
	protected String divisionName;
	protected int dayDateWritten = 0;
	protected String monthDateWritten;
	protected int yearDateWritten = 0;
	protected String constantName;
	protected double constantValue;
	protected int lineNumber = 0;
	
	//********** new addition 26/3/2022********/
	protected String mainLogic;

	protected String displayBase;
	
	protected String perform;
	
	protected String accept;
	
	protected String through;
	
	protected String workignStorageSection;
	//************ new addition 27/3/2022
	protected String hexData;
	
	protected String decimalBase;
	
	protected String move;
	
	protected String to;
	
	protected String divide;
	
	protected String wNumber;
	
	protected String at;
	
	protected String when;
	
	protected String is;
	
	/**
	 * @return the is
	 */
	public String getIs() {
		return is;
	}

	/**
	 * @param is the is to set
	 */
	public void setIs(String is) {
		this.is = is;
	}

	/**
	 * @return the when
	 */
	public String getWhen() {
		return when;
	}

	/**
	 * @param when the when to set
	 */
	public void setWhen(String when) {
		this.when = when;
	}

	/**
	 * @return the at
	 */
	public String getAt() {
		return at;
	}

	/**
	 * @param at the at to set
	 */
	public void setAt(String at) {
		this.at = at;
	}

	/**
	 * @return the wNumber
	 */
	public String getwNumber() {
		return wNumber;
	}

	/**
	 * @param wNumber the wNumber to set
	 */
	public void setwNumber(String wNumber) {
		this.wNumber = wNumber;
	}

	protected String search;
	
	
	/**
	 * @return the search
	 */
	public String getSearch() {
		return search;
	}

	/**
	 * @param search the search to set
	 */
	public void setSearch(String search) {
		this.search = search;
	}

	/**
	 * @return the divide
	 */
	public String getDivide() {
		return divide;
	}

	/**
	 * @param divide the divide to set
	 */
	public void setDivide(String divide) {
		this.divide = divide;
	}

	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}

	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}

	/**
	 * @return the move
	 */
	public String getMove() {
		return move;
	}

	/**
	 * @param move the move to set
	 */
	public void setMove(String move) {
		this.move = move;
	}

	/**
	 * @return the hexData
	 */
	public String getHexData() {
		return hexData;
	}

	/**
	 * @return the decimalBase
	 */
	public String getDecimalBase() {
		return decimalBase;
	}

	/**
	 * @param decimalBase the decimalBase to set
	 */
	public void setDecimalBase(String decimalBase) {
		this.decimalBase = decimalBase;
	}

	/**
	 * @param hexData the hexData to set
	 */
	public void setHexData(String hexData) {
		this.hexData = hexData;
	}

	/**
	 * @return the workignStorageSection
	 */
//	public String getWorkignStorageSection() {
//		return workignStorageSection;
//	}
//
//	/**
//	 * @param workignStorageSection the workignStorageSection to set
//	 */
//	public void setWorkignStorageSection(String workignStorageSection) {
//		this.workignStorageSection = workignStorageSection;
//	}

	/**
	 * @return the through
	 */
	public String getThrough() {
		return through;
	}

	/**
	 * @param through the through to set
	 */
	public void setThrough(String through) {
		this.through = through;
	}

	/**
	 * @return the accept
	 */
	public String getAccept() {
		return accept;
	}

	/**
	 * @param accept the accept to set
	 */
	public void setAccept(String accept) {
		this.accept = accept;
	}

	/**
	 * @return the perform
	 */
	public String getPerform() {
		return perform;
	}

	/**
	 * @param perform the perform to set
	 */
	public void setPerform(String perform) {
		this.perform = perform;
	}

	/**
	 * @return the displayBase
	 */
	public String getDisplayBase() {
		return displayBase;
	}

	/**
	 * @param displayBase the displayBase to set
	 */
	public void setDisplayBase(String displayBase) {
		this.displayBase = displayBase;
	}


	/**
	 * @return the mainLogic
	 */
	public String getMainLogic() {
		return mainLogic;
	}

	/**
	 * @param mainLogic the mainLogic to set
	 */
	public void setMainLogic(String mainLogic) {
		this.mainLogic = mainLogic;
	}

	public String getCommentLine() {
		return commentLine;
	}

	public void setCommentLine(String commentLine) {
		this.commentLine = commentLine;
	}
	public String getProgram_id() {
		return program_id;
	}
	public void setProgram_id(String program_id) {
		this.program_id = program_id;
	}
	public String getConstantName() {
		return constantName;
	}
	public void setConstantName(String constantName) {
		this.constantName = constantName;
	}
	public double getConstantValue() {
		return constantValue;
	}
	public void setConstantValue(double constantValue) {
		this.constantValue = constantValue;
	}
	public int getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	


	/**
	 * Return a copy of this object.
	 *
	 * @return a copy of this object
	 */
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// this shouldn't happen, since we are Cloneable
			throw new InternalError();
		}
	}
	/**
	 * Compares two objects for equality, treating nulls carefullly,
	 * and relying on the first object's implementation of <code>
	 * equals()</code>.
	 *
	 * @param   o1   one object
	 *
	 * @param   o2   the other
	 *
	 * @return  <code>true</code> if the objects are equal and
	 *          <code>false</code> otherwise.
	 */
	public static boolean ifCobolObjEqual(Object o1, Object o2) {
		if (o1 == null || o2 == null) {
			return o1 == null && o2 == null;
		}
		return o1.equals(o2);
	}
	/**
	 * Compares this object against the specified object. The 
	 * result is <code>true</code> if and only if the argument is 
	 * not <code>null</code> and is a <code>Coffee</code> object 
	 * whose attributes all equal this object's attributes.
	 *
	 * @param   o   the object to compare with.
	 *
	 * @return  <code>true</code> if the objects are equal and
	 *          <code>false</code> otherwise.
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Cobol)) {
			return false;
		}
		Cobol c = (Cobol) o;


		if (!ifCobolObjEqual(program_id, c.program_id)) {
			return false;
		}

		if (!ifCobolObjEqual(sectionName, c.sectionName)) {
			return false;
		}


		return true;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}


	/**
	 * Return line of commented text from the COBOL program.
	 *
	 * @return line of commented text from the COBOL program
	 */
	
	/**
	 * Return the name of this COBOL program.
	 *
	 * @return the name of this COBOL program
	 */
	public String getProgram_ID() {
		return program_id;
	}

	/**
	 * Return the section name.
	 *
	 * @return the section name
	 */
	public String getSectionName() {
		return sectionName;
	}

	/**
	 * Return the division name.
	 *
	 * @return the division name
	 */
	public String getDivisionName() {
		return divisionName;
	}

	/**
	 * Return the dayDateWritten of this COBOL program.
	 *
	 * @return the dayDateWritten of this COBOL program
	 */
	public int getDayDateWritten() {
		return dayDateWritten;
	}


	/**
	 * Return the monthWritten of this COBOL program.
	 *
	 * @return the monthWritten of this COBOL program
	 */
	public String getMonthDateWritten() {
		return monthDateWritten;
	}

	/**
	 * Return the dayDateWritten of this COBOL program.
	 *
	 * @return the dayDateWritten of this COBOL program
	 */
	public int getYearDateWritten() {
		return yearDateWritten;
	}

	/**
	 * Set a line of commented text from the COBOL program.
	 *
	 * @return line of commented text from the COBOL program
	 */
	



	/**
	 * Set the name of this cobol file.
	 *
	 * @param   String   the name
	 */
	public void setProgram_ID(String program_idString) {
		this.program_id = program_idString;
	}

	/**
	 * Set the dayDateWritten of this COBOL program.
	 *
	 * @param the dayDateWritten of this COBOL program
	 */
	public void setDayDateWritten(int dayDateWritten) {
		this.dayDateWritten = dayDateWritten;
	}

	/**
	 * Return the monthWritten of this COBOL program.
	 *
	 * @return the monthWritten of this COBOL program
	 */
	public void setMonthDateWritten(String monthDateWritten) {
		this.monthDateWritten = monthDateWritten;
	}

	/**
	 * Set the yearDateWritten of this COBOL program.
	 *
	 * @param the yearDateWritten of this COBOL program
	 */
	public void setYearDateWritten(int yearDateWritten) {
		this.yearDateWritten = yearDateWritten;
	}


	/**
	 * Set the section name 
	 *
	 * @param  String sectionName
	 */
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	/**
	 * Set the division name 
	 *
	 * @param  String divisionName
	 */
	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

	/**
	 * Return a textual description of this cobol type.
	 * 
	 * @return a textual description of this cobol type
	 */
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append(program_id);
		buf.append(", ");
		buf.append(divisionName);
		buf.append(", ");
		buf.append(sectionName);
		buf.append(", ");
		buf.append("main-logic");

		return buf.toString();
	}


}
