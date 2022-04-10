package mao.spring_boot_integrate_mybatis.data;

/**
 * The type Student.
 */
public class Student
{
    private Long studentNo;

    private String name;

    private String sex;

    private String telephoneNumber;

    private String familyTelephoneNumber;

    private String birthday;

    private String address;

    private String idCard;

    private String email;

    private String dormitoryNumber;

    private Long classNo;

    private String state;

    private String remarks;

    /**
     * Gets student no.
     *
     * @return the student no
     */
    public Long getStudentNo()
    {
        return studentNo;
    }

    /**
     * Sets student no.
     *
     * @param studentNo the student no
     */
    public void setStudentNo(Long studentNo)
    {
        this.studentNo = studentNo;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Gets sex.
     *
     * @return the sex
     */
    public String getSex()
    {
        return sex;
    }

    /**
     * Sets sex.
     *
     * @param sex the sex
     */
    public void setSex(String sex)
    {
        this.sex = sex;
    }

    /**
     * Gets telephone number.
     *
     * @return the telephone number
     */
    public String getTelephoneNumber()
    {
        return telephoneNumber;
    }

    /**
     * Sets telephone number.
     *
     * @param telephoneNumber the telephone number
     */
    public void setTelephoneNumber(String telephoneNumber)
    {
        this.telephoneNumber = telephoneNumber;
    }

    /**
     * Gets family telephone number.
     *
     * @return the family telephone number
     */
    public String getFamilyTelephoneNumber()
    {
        return familyTelephoneNumber;
    }

    /**
     * Sets family telephone number.
     *
     * @param familyTelephoneNumber the family telephone number
     */
    public void setFamilyTelephoneNumber(String familyTelephoneNumber)
    {
        this.familyTelephoneNumber = familyTelephoneNumber;
    }

    /**
     * Gets birthday.
     *
     * @return the birthday
     */
    public String getBirthday()
    {
        return birthday;
    }

    /**
     * Sets birthday.
     *
     * @param birthday the birthday
     */
    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     * Gets id card.
     *
     * @return the id card
     */
    public String getIdCard()
    {
        return idCard;
    }

    /**
     * Sets id card.
     *
     * @param idCard the id card
     */
    public void setIdCard(String idCard)
    {
        this.idCard = idCard;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * Gets dormitory number.
     *
     * @return the dormitory number
     */
    public String getDormitoryNumber()
    {
        return dormitoryNumber;
    }

    /**
     * Sets dormitory number.
     *
     * @param dormitoryNumber the dormitory number
     */
    public void setDormitoryNumber(String dormitoryNumber)
    {
        this.dormitoryNumber = dormitoryNumber;
    }

    /**
     * Gets class no.
     *
     * @return the class no
     */
    public Long getClassNo()
    {
        return classNo;
    }

    /**
     * Sets class no.
     *
     * @param classNo the class no
     */
    public void setClassNo(Long classNo)
    {
        this.classNo = classNo;
    }

    /**
     * Gets state.
     *
     * @return the state
     */
    public String getState()
    {
        return state;
    }

    /**
     * Sets state.
     *
     * @param state the state
     */
    public void setState(String state)
    {
        this.state = state;
    }

    /**
     * Gets remarks.
     *
     * @return the remarks
     */
    public String getRemarks()
    {
        return remarks;
    }

    /**
     * Sets remarks.
     *
     * @param remarks the remarks
     */
    public void setRemarks(String remarks)
    {
        this.remarks = remarks;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("studentNo：").append(studentNo).append('\n');
        stringbuilder.append("name：").append(name).append('\n');
        stringbuilder.append("sex：").append(sex).append('\n');
        stringbuilder.append("telephoneNumber：").append(telephoneNumber).append('\n');
        stringbuilder.append("familyTelephoneNumber：").append(familyTelephoneNumber).append('\n');
        stringbuilder.append("birthday：").append(birthday).append('\n');
        stringbuilder.append("address：").append(address).append('\n');
        stringbuilder.append("idCard：").append(idCard).append('\n');
        stringbuilder.append("email：").append(email).append('\n');
        stringbuilder.append("dormitoryNumber：").append(dormitoryNumber).append('\n');
        stringbuilder.append("classNo：").append(classNo).append('\n');
        stringbuilder.append("state：").append(state).append('\n');
        stringbuilder.append("remarks：").append(remarks).append('\n');
        return stringbuilder.toString();
    }
}