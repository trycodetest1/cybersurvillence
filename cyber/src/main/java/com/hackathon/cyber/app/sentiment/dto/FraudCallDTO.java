package com.hackathon.cyber.app.sentiment.dto;

/**
 * @author sschougu
 *
 */
public class FraudCallDTO {

 
 /**
  * 
  */
 String fromPhone;
 /**
  * 
  */
 String toPhone;
 /**
  * 
  */
 int severity;
 /**
  * 
  */
 String fraudDescription;
 
 /**
  * 
  */
 public FraudType type;

 /**
  * @author sschougu
  *
  */
 public enum FraudType { CALL, SMS, BOTH };
 /**
  * @author sschougu
  *
  */
 public enum Category { LOTTERY, CREDITCARD, OTHER };
 public Category category;
 
 public void setType(FraudType type) {
  this.type = type;
 }

 public FraudType getType() {
        return type;
    }   
 
 public String getFromPhone() {
  return fromPhone;
 }

 public void setFromPhone(String fromPhone) {
  this.fromPhone = fromPhone;
 }

 public String getToPhone() {
  return toPhone;
 }

 public void setToPhone(String toPhone) {
  this.toPhone = toPhone;
 }

 public int getSeverity() {
  return severity;
 }

 public void setSeverity(int severity) {
  this.severity = severity;
 }

 public String getFraudDescription() {
  return fraudDescription;
 }

 public void setFraudDescription(String fraudDescription) {
  this.fraudDescription = fraudDescription;
 }

 public Category getCategory() {
    return category;
   }

   public void setCategory(Category category) {
    this.category = category;
   }
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  for (Category s : Category.values())  
   System.out.println(s);  
 }

@Override
public String toString() {
	return "FraudCallDTO [fromPhone=" + fromPhone + ", toPhone=" + toPhone + ", severity=" + severity
			+ ", fraudDescription=" + fraudDescription + ", type=" + type + ", category=" + category + "]";
}

}
