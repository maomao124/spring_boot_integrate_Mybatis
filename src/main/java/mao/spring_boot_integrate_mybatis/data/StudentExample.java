package mao.spring_boot_integrate_mybatis.data;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Student example.
 */
public class StudentExample
{
    /**
     * The Order by clause.
     */
    protected String orderByClause;

    /**
     * The Distinct.
     */
    protected boolean distinct;

    /**
     * The Ored criteria.
     */
    protected List<Criteria> oredCriteria;

    /**
     * Instantiates a new Student example.
     */
    public StudentExample()
    {
        oredCriteria = new ArrayList<>();
    }

    /**
     * Sets order by clause.
     *
     * @param orderByClause the order by clause
     */
    public void setOrderByClause(String orderByClause)
    {
        this.orderByClause = orderByClause;
    }

    /**
     * Gets order by clause.
     *
     * @return the order by clause
     */
    public String getOrderByClause()
    {
        return orderByClause;
    }

    /**
     * Sets distinct.
     *
     * @param distinct the distinct
     */
    public void setDistinct(boolean distinct)
    {
        this.distinct = distinct;
    }

    /**
     * Is distinct boolean.
     *
     * @return the boolean
     */
    public boolean isDistinct()
    {
        return distinct;
    }

    /**
     * Gets ored criteria.
     *
     * @return the ored criteria
     */
    public List<Criteria> getOredCriteria()
    {
        return oredCriteria;
    }

    /**
     * Or.
     *
     * @param criteria the criteria
     */
    public void or(Criteria criteria)
    {
        oredCriteria.add(criteria);
    }

    /**
     * Or criteria.
     *
     * @return the criteria
     */
    public Criteria or()
    {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * Create criteria criteria.
     *
     * @return the criteria
     */
    public Criteria createCriteria()
    {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0)
        {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * Create criteria internal criteria.
     *
     * @return the criteria
     */
    protected Criteria createCriteriaInternal()
    {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * Clear.
     */
    public void clear()
    {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * The type Generated criteria.
     */
    protected abstract static class GeneratedCriteria
    {
        /**
         * The Criteria.
         */
        protected List<Criterion> criteria;

        /**
         * Instantiates a new Generated criteria.
         */
        protected GeneratedCriteria()
        {
            super();
            criteria = new ArrayList<>();
        }

        /**
         * Is valid boolean.
         *
         * @return the boolean
         */
        public boolean isValid()
        {
            return criteria.size() > 0;
        }

        /**
         * Gets all criteria.
         *
         * @return the all criteria
         */
        public List<Criterion> getAllCriteria()
        {
            return criteria;
        }

        /**
         * Gets criteria.
         *
         * @return the criteria
         */
        public List<Criterion> getCriteria()
        {
            return criteria;
        }

        /**
         * Add criterion.
         *
         * @param condition the condition
         */
        protected void addCriterion(String condition)
        {
            if (condition == null)
            {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        /**
         * Add criterion.
         *
         * @param condition the condition
         * @param value     the value
         * @param property  the property
         */
        protected void addCriterion(String condition, Object value, String property)
        {
            if (value == null)
            {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        /**
         * Add criterion.
         *
         * @param condition the condition
         * @param value1    the value 1
         * @param value2    the value 2
         * @param property  the property
         */
        protected void addCriterion(String condition, Object value1, Object value2, String property)
        {
            if (value1 == null || value2 == null)
            {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        /**
         * And student no is null criteria.
         *
         * @return the criteria
         */
        public Criteria andStudentNoIsNull()
        {
            addCriterion("student_no is null");
            return (Criteria) this;
        }

        /**
         * And student no is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andStudentNoIsNotNull()
        {
            addCriterion("student_no is not null");
            return (Criteria) this;
        }

        /**
         * And student no equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andStudentNoEqualTo(Long value)
        {
            addCriterion("student_no =", value, "studentNo");
            return (Criteria) this;
        }

        /**
         * And student no not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andStudentNoNotEqualTo(Long value)
        {
            addCriterion("student_no <>", value, "studentNo");
            return (Criteria) this;
        }

        /**
         * And student no greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andStudentNoGreaterThan(Long value)
        {
            addCriterion("student_no >", value, "studentNo");
            return (Criteria) this;
        }

        /**
         * And student no greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andStudentNoGreaterThanOrEqualTo(Long value)
        {
            addCriterion("student_no >=", value, "studentNo");
            return (Criteria) this;
        }

        /**
         * And student no less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andStudentNoLessThan(Long value)
        {
            addCriterion("student_no <", value, "studentNo");
            return (Criteria) this;
        }

        /**
         * And student no less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andStudentNoLessThanOrEqualTo(Long value)
        {
            addCriterion("student_no <=", value, "studentNo");
            return (Criteria) this;
        }

        /**
         * And student no in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andStudentNoIn(List<Long> values)
        {
            addCriterion("student_no in", values, "studentNo");
            return (Criteria) this;
        }

        /**
         * And student no not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andStudentNoNotIn(List<Long> values)
        {
            addCriterion("student_no not in", values, "studentNo");
            return (Criteria) this;
        }

        /**
         * And student no between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andStudentNoBetween(Long value1, Long value2)
        {
            addCriterion("student_no between", value1, value2, "studentNo");
            return (Criteria) this;
        }

        /**
         * And student no not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andStudentNoNotBetween(Long value1, Long value2)
        {
            addCriterion("student_no not between", value1, value2, "studentNo");
            return (Criteria) this;
        }

        /**
         * And name is null criteria.
         *
         * @return the criteria
         */
        public Criteria andNameIsNull()
        {
            addCriterion("name is null");
            return (Criteria) this;
        }

        /**
         * And name is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andNameIsNotNull()
        {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        /**
         * And name equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNameEqualTo(String value)
        {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        /**
         * And name not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNameNotEqualTo(String value)
        {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        /**
         * And name greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNameGreaterThan(String value)
        {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        /**
         * And name greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNameGreaterThanOrEqualTo(String value)
        {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        /**
         * And name less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNameLessThan(String value)
        {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        /**
         * And name less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNameLessThanOrEqualTo(String value)
        {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        /**
         * And name like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNameLike(String value)
        {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        /**
         * And name not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNameNotLike(String value)
        {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        /**
         * And name in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andNameIn(List<String> values)
        {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        /**
         * And name not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andNameNotIn(List<String> values)
        {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        /**
         * And name between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andNameBetween(String value1, String value2)
        {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        /**
         * And name not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andNameNotBetween(String value1, String value2)
        {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        /**
         * And sex is null criteria.
         *
         * @return the criteria
         */
        public Criteria andSexIsNull()
        {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        /**
         * And sex is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andSexIsNotNull()
        {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        /**
         * And sex equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andSexEqualTo(String value)
        {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        /**
         * And sex not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andSexNotEqualTo(String value)
        {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        /**
         * And sex greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andSexGreaterThan(String value)
        {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        /**
         * And sex greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andSexGreaterThanOrEqualTo(String value)
        {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        /**
         * And sex less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andSexLessThan(String value)
        {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        /**
         * And sex less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andSexLessThanOrEqualTo(String value)
        {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        /**
         * And sex like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andSexLike(String value)
        {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        /**
         * And sex not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andSexNotLike(String value)
        {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        /**
         * And sex in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andSexIn(List<String> values)
        {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        /**
         * And sex not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andSexNotIn(List<String> values)
        {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        /**
         * And sex between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andSexBetween(String value1, String value2)
        {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        /**
         * And sex not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andSexNotBetween(String value1, String value2)
        {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        /**
         * And telephone number is null criteria.
         *
         * @return the criteria
         */
        public Criteria andTelephoneNumberIsNull()
        {
            addCriterion("telephone_number is null");
            return (Criteria) this;
        }

        /**
         * And telephone number is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andTelephoneNumberIsNotNull()
        {
            addCriterion("telephone_number is not null");
            return (Criteria) this;
        }

        /**
         * And telephone number equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTelephoneNumberEqualTo(String value)
        {
            addCriterion("telephone_number =", value, "telephoneNumber");
            return (Criteria) this;
        }

        /**
         * And telephone number not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTelephoneNumberNotEqualTo(String value)
        {
            addCriterion("telephone_number <>", value, "telephoneNumber");
            return (Criteria) this;
        }

        /**
         * And telephone number greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTelephoneNumberGreaterThan(String value)
        {
            addCriterion("telephone_number >", value, "telephoneNumber");
            return (Criteria) this;
        }

        /**
         * And telephone number greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTelephoneNumberGreaterThanOrEqualTo(String value)
        {
            addCriterion("telephone_number >=", value, "telephoneNumber");
            return (Criteria) this;
        }

        /**
         * And telephone number less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTelephoneNumberLessThan(String value)
        {
            addCriterion("telephone_number <", value, "telephoneNumber");
            return (Criteria) this;
        }

        /**
         * And telephone number less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTelephoneNumberLessThanOrEqualTo(String value)
        {
            addCriterion("telephone_number <=", value, "telephoneNumber");
            return (Criteria) this;
        }

        /**
         * And telephone number like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTelephoneNumberLike(String value)
        {
            addCriterion("telephone_number like", value, "telephoneNumber");
            return (Criteria) this;
        }

        /**
         * And telephone number not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTelephoneNumberNotLike(String value)
        {
            addCriterion("telephone_number not like", value, "telephoneNumber");
            return (Criteria) this;
        }

        /**
         * And telephone number in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTelephoneNumberIn(List<String> values)
        {
            addCriterion("telephone_number in", values, "telephoneNumber");
            return (Criteria) this;
        }

        /**
         * And telephone number not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTelephoneNumberNotIn(List<String> values)
        {
            addCriterion("telephone_number not in", values, "telephoneNumber");
            return (Criteria) this;
        }

        /**
         * And telephone number between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTelephoneNumberBetween(String value1, String value2)
        {
            addCriterion("telephone_number between", value1, value2, "telephoneNumber");
            return (Criteria) this;
        }

        /**
         * And telephone number not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTelephoneNumberNotBetween(String value1, String value2)
        {
            addCriterion("telephone_number not between", value1, value2, "telephoneNumber");
            return (Criteria) this;
        }

        /**
         * And family telephone number is null criteria.
         *
         * @return the criteria
         */
        public Criteria andFamilyTelephoneNumberIsNull()
        {
            addCriterion("family_telephone_number is null");
            return (Criteria) this;
        }

        /**
         * And family telephone number is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andFamilyTelephoneNumberIsNotNull()
        {
            addCriterion("family_telephone_number is not null");
            return (Criteria) this;
        }

        /**
         * And family telephone number equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andFamilyTelephoneNumberEqualTo(String value)
        {
            addCriterion("family_telephone_number =", value, "familyTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And family telephone number not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andFamilyTelephoneNumberNotEqualTo(String value)
        {
            addCriterion("family_telephone_number <>", value, "familyTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And family telephone number greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andFamilyTelephoneNumberGreaterThan(String value)
        {
            addCriterion("family_telephone_number >", value, "familyTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And family telephone number greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andFamilyTelephoneNumberGreaterThanOrEqualTo(String value)
        {
            addCriterion("family_telephone_number >=", value, "familyTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And family telephone number less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andFamilyTelephoneNumberLessThan(String value)
        {
            addCriterion("family_telephone_number <", value, "familyTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And family telephone number less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andFamilyTelephoneNumberLessThanOrEqualTo(String value)
        {
            addCriterion("family_telephone_number <=", value, "familyTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And family telephone number like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andFamilyTelephoneNumberLike(String value)
        {
            addCriterion("family_telephone_number like", value, "familyTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And family telephone number not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andFamilyTelephoneNumberNotLike(String value)
        {
            addCriterion("family_telephone_number not like", value, "familyTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And family telephone number in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andFamilyTelephoneNumberIn(List<String> values)
        {
            addCriterion("family_telephone_number in", values, "familyTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And family telephone number not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andFamilyTelephoneNumberNotIn(List<String> values)
        {
            addCriterion("family_telephone_number not in", values, "familyTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And family telephone number between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andFamilyTelephoneNumberBetween(String value1, String value2)
        {
            addCriterion("family_telephone_number between", value1, value2, "familyTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And family telephone number not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andFamilyTelephoneNumberNotBetween(String value1, String value2)
        {
            addCriterion("family_telephone_number not between", value1, value2, "familyTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And birthday is null criteria.
         *
         * @return the criteria
         */
        public Criteria andBirthdayIsNull()
        {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        /**
         * And birthday is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andBirthdayIsNotNull()
        {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        /**
         * And birthday equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andBirthdayEqualTo(String value)
        {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        /**
         * And birthday not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andBirthdayNotEqualTo(String value)
        {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        /**
         * And birthday greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andBirthdayGreaterThan(String value)
        {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        /**
         * And birthday greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andBirthdayGreaterThanOrEqualTo(String value)
        {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        /**
         * And birthday less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andBirthdayLessThan(String value)
        {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        /**
         * And birthday less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andBirthdayLessThanOrEqualTo(String value)
        {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        /**
         * And birthday like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andBirthdayLike(String value)
        {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        /**
         * And birthday not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andBirthdayNotLike(String value)
        {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        /**
         * And birthday in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andBirthdayIn(List<String> values)
        {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        /**
         * And birthday not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andBirthdayNotIn(List<String> values)
        {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        /**
         * And birthday between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andBirthdayBetween(String value1, String value2)
        {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        /**
         * And birthday not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andBirthdayNotBetween(String value1, String value2)
        {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        /**
         * And address is null criteria.
         *
         * @return the criteria
         */
        public Criteria andAddressIsNull()
        {
            addCriterion("address is null");
            return (Criteria) this;
        }

        /**
         * And address is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andAddressIsNotNull()
        {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        /**
         * And address equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAddressEqualTo(String value)
        {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        /**
         * And address not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAddressNotEqualTo(String value)
        {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        /**
         * And address greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAddressGreaterThan(String value)
        {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        /**
         * And address greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAddressGreaterThanOrEqualTo(String value)
        {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        /**
         * And address less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAddressLessThan(String value)
        {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        /**
         * And address less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAddressLessThanOrEqualTo(String value)
        {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        /**
         * And address like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAddressLike(String value)
        {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        /**
         * And address not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAddressNotLike(String value)
        {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        /**
         * And address in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andAddressIn(List<String> values)
        {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        /**
         * And address not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andAddressNotIn(List<String> values)
        {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        /**
         * And address between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andAddressBetween(String value1, String value2)
        {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        /**
         * And address not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andAddressNotBetween(String value1, String value2)
        {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        /**
         * And id card is null criteria.
         *
         * @return the criteria
         */
        public Criteria andIdCardIsNull()
        {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        /**
         * And id card is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andIdCardIsNotNull()
        {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        /**
         * And id card equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andIdCardEqualTo(String value)
        {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        /**
         * And id card not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andIdCardNotEqualTo(String value)
        {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        /**
         * And id card greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andIdCardGreaterThan(String value)
        {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        /**
         * And id card greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andIdCardGreaterThanOrEqualTo(String value)
        {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        /**
         * And id card less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andIdCardLessThan(String value)
        {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        /**
         * And id card less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andIdCardLessThanOrEqualTo(String value)
        {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        /**
         * And id card like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andIdCardLike(String value)
        {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        /**
         * And id card not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andIdCardNotLike(String value)
        {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        /**
         * And id card in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andIdCardIn(List<String> values)
        {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        /**
         * And id card not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andIdCardNotIn(List<String> values)
        {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        /**
         * And id card between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andIdCardBetween(String value1, String value2)
        {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        /**
         * And id card not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andIdCardNotBetween(String value1, String value2)
        {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        /**
         * And email is null criteria.
         *
         * @return the criteria
         */
        public Criteria andEmailIsNull()
        {
            addCriterion("email is null");
            return (Criteria) this;
        }

        /**
         * And email is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andEmailIsNotNull()
        {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        /**
         * And email equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andEmailEqualTo(String value)
        {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        /**
         * And email not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andEmailNotEqualTo(String value)
        {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        /**
         * And email greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andEmailGreaterThan(String value)
        {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        /**
         * And email greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andEmailGreaterThanOrEqualTo(String value)
        {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        /**
         * And email less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andEmailLessThan(String value)
        {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        /**
         * And email less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andEmailLessThanOrEqualTo(String value)
        {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        /**
         * And email like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andEmailLike(String value)
        {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        /**
         * And email not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andEmailNotLike(String value)
        {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        /**
         * And email in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andEmailIn(List<String> values)
        {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        /**
         * And email not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andEmailNotIn(List<String> values)
        {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        /**
         * And email between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andEmailBetween(String value1, String value2)
        {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        /**
         * And email not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andEmailNotBetween(String value1, String value2)
        {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        /**
         * And dormitory number is null criteria.
         *
         * @return the criteria
         */
        public Criteria andDormitoryNumberIsNull()
        {
            addCriterion("dormitory_number is null");
            return (Criteria) this;
        }

        /**
         * And dormitory number is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andDormitoryNumberIsNotNull()
        {
            addCriterion("dormitory_number is not null");
            return (Criteria) this;
        }

        /**
         * And dormitory number equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andDormitoryNumberEqualTo(String value)
        {
            addCriterion("dormitory_number =", value, "dormitoryNumber");
            return (Criteria) this;
        }

        /**
         * And dormitory number not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andDormitoryNumberNotEqualTo(String value)
        {
            addCriterion("dormitory_number <>", value, "dormitoryNumber");
            return (Criteria) this;
        }

        /**
         * And dormitory number greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andDormitoryNumberGreaterThan(String value)
        {
            addCriterion("dormitory_number >", value, "dormitoryNumber");
            return (Criteria) this;
        }

        /**
         * And dormitory number greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andDormitoryNumberGreaterThanOrEqualTo(String value)
        {
            addCriterion("dormitory_number >=", value, "dormitoryNumber");
            return (Criteria) this;
        }

        /**
         * And dormitory number less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andDormitoryNumberLessThan(String value)
        {
            addCriterion("dormitory_number <", value, "dormitoryNumber");
            return (Criteria) this;
        }

        /**
         * And dormitory number less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andDormitoryNumberLessThanOrEqualTo(String value)
        {
            addCriterion("dormitory_number <=", value, "dormitoryNumber");
            return (Criteria) this;
        }

        /**
         * And dormitory number like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andDormitoryNumberLike(String value)
        {
            addCriterion("dormitory_number like", value, "dormitoryNumber");
            return (Criteria) this;
        }

        /**
         * And dormitory number not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andDormitoryNumberNotLike(String value)
        {
            addCriterion("dormitory_number not like", value, "dormitoryNumber");
            return (Criteria) this;
        }

        /**
         * And dormitory number in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andDormitoryNumberIn(List<String> values)
        {
            addCriterion("dormitory_number in", values, "dormitoryNumber");
            return (Criteria) this;
        }

        /**
         * And dormitory number not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andDormitoryNumberNotIn(List<String> values)
        {
            addCriterion("dormitory_number not in", values, "dormitoryNumber");
            return (Criteria) this;
        }

        /**
         * And dormitory number between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andDormitoryNumberBetween(String value1, String value2)
        {
            addCriterion("dormitory_number between", value1, value2, "dormitoryNumber");
            return (Criteria) this;
        }

        /**
         * And dormitory number not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andDormitoryNumberNotBetween(String value1, String value2)
        {
            addCriterion("dormitory_number not between", value1, value2, "dormitoryNumber");
            return (Criteria) this;
        }

        /**
         * And class no is null criteria.
         *
         * @return the criteria
         */
        public Criteria andClassNoIsNull()
        {
            addCriterion("class_no is null");
            return (Criteria) this;
        }

        /**
         * And class no is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andClassNoIsNotNull()
        {
            addCriterion("class_no is not null");
            return (Criteria) this;
        }

        /**
         * And class no equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassNoEqualTo(Long value)
        {
            addCriterion("class_no =", value, "classNo");
            return (Criteria) this;
        }

        /**
         * And class no not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassNoNotEqualTo(Long value)
        {
            addCriterion("class_no <>", value, "classNo");
            return (Criteria) this;
        }

        /**
         * And class no greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassNoGreaterThan(Long value)
        {
            addCriterion("class_no >", value, "classNo");
            return (Criteria) this;
        }

        /**
         * And class no greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassNoGreaterThanOrEqualTo(Long value)
        {
            addCriterion("class_no >=", value, "classNo");
            return (Criteria) this;
        }

        /**
         * And class no less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassNoLessThan(Long value)
        {
            addCriterion("class_no <", value, "classNo");
            return (Criteria) this;
        }

        /**
         * And class no less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassNoLessThanOrEqualTo(Long value)
        {
            addCriterion("class_no <=", value, "classNo");
            return (Criteria) this;
        }

        /**
         * And class no in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andClassNoIn(List<Long> values)
        {
            addCriterion("class_no in", values, "classNo");
            return (Criteria) this;
        }

        /**
         * And class no not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andClassNoNotIn(List<Long> values)
        {
            addCriterion("class_no not in", values, "classNo");
            return (Criteria) this;
        }

        /**
         * And class no between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andClassNoBetween(Long value1, Long value2)
        {
            addCriterion("class_no between", value1, value2, "classNo");
            return (Criteria) this;
        }

        /**
         * And class no not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andClassNoNotBetween(Long value1, Long value2)
        {
            addCriterion("class_no not between", value1, value2, "classNo");
            return (Criteria) this;
        }

        /**
         * And state is null criteria.
         *
         * @return the criteria
         */
        public Criteria andStateIsNull()
        {
            addCriterion("state is null");
            return (Criteria) this;
        }

        /**
         * And state is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andStateIsNotNull()
        {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        /**
         * And state equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andStateEqualTo(String value)
        {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        /**
         * And state not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andStateNotEqualTo(String value)
        {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        /**
         * And state greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andStateGreaterThan(String value)
        {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        /**
         * And state greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andStateGreaterThanOrEqualTo(String value)
        {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        /**
         * And state less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andStateLessThan(String value)
        {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        /**
         * And state less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andStateLessThanOrEqualTo(String value)
        {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        /**
         * And state like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andStateLike(String value)
        {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        /**
         * And state not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andStateNotLike(String value)
        {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        /**
         * And state in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andStateIn(List<String> values)
        {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        /**
         * And state not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andStateNotIn(List<String> values)
        {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        /**
         * And state between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andStateBetween(String value1, String value2)
        {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        /**
         * And state not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andStateNotBetween(String value1, String value2)
        {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        /**
         * And remarks is null criteria.
         *
         * @return the criteria
         */
        public Criteria andRemarksIsNull()
        {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        /**
         * And remarks is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andRemarksIsNotNull()
        {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        /**
         * And remarks equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andRemarksEqualTo(String value)
        {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        /**
         * And remarks not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andRemarksNotEqualTo(String value)
        {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        /**
         * And remarks greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andRemarksGreaterThan(String value)
        {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        /**
         * And remarks greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andRemarksGreaterThanOrEqualTo(String value)
        {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        /**
         * And remarks less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andRemarksLessThan(String value)
        {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        /**
         * And remarks less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andRemarksLessThanOrEqualTo(String value)
        {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        /**
         * And remarks like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andRemarksLike(String value)
        {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        /**
         * And remarks not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andRemarksNotLike(String value)
        {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        /**
         * And remarks in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andRemarksIn(List<String> values)
        {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        /**
         * And remarks not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andRemarksNotIn(List<String> values)
        {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        /**
         * And remarks between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andRemarksBetween(String value1, String value2)
        {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        /**
         * And remarks not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andRemarksNotBetween(String value1, String value2)
        {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }
    }

    /**
     * The type Criteria.
     */
    public static class Criteria extends GeneratedCriteria
    {
        /**
         * Instantiates a new Criteria.
         */
        protected Criteria()
        {
            super();
        }
    }

    /**
     * The type Criterion.
     */
    public static class Criterion
    {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        /**
         * Gets condition.
         *
         * @return the condition
         */
        public String getCondition()
        {
            return condition;
        }

        /**
         * Gets value.
         *
         * @return the value
         */
        public Object getValue()
        {
            return value;
        }

        /**
         * Gets second value.
         *
         * @return the second value
         */
        public Object getSecondValue()
        {
            return secondValue;
        }

        /**
         * Is no value boolean.
         *
         * @return the boolean
         */
        public boolean isNoValue()
        {
            return noValue;
        }

        /**
         * Is single value boolean.
         *
         * @return the boolean
         */
        public boolean isSingleValue()
        {
            return singleValue;
        }

        /**
         * Is between value boolean.
         *
         * @return the boolean
         */
        public boolean isBetweenValue()
        {
            return betweenValue;
        }

        /**
         * Is list value boolean.
         *
         * @return the boolean
         */
        public boolean isListValue()
        {
            return listValue;
        }

        /**
         * Gets type handler.
         *
         * @return the type handler
         */
        public String getTypeHandler()
        {
            return typeHandler;
        }

        /**
         * Instantiates a new Criterion.
         *
         * @param condition the condition
         */
        protected Criterion(String condition)
        {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        /**
         * Instantiates a new Criterion.
         *
         * @param condition   the condition
         * @param value       the value
         * @param typeHandler the type handler
         */
        protected Criterion(String condition, Object value, String typeHandler)
        {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>)
            {
                this.listValue = true;
            }
            else
            {
                this.singleValue = true;
            }
        }

        /**
         * Instantiates a new Criterion.
         *
         * @param condition the condition
         * @param value     the value
         */
        protected Criterion(String condition, Object value)
        {
            this(condition, value, null);
        }

        /**
         * Instantiates a new Criterion.
         *
         * @param condition   the condition
         * @param value       the value
         * @param secondValue the second value
         * @param typeHandler the type handler
         */
        protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
        {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        /**
         * Instantiates a new Criterion.
         *
         * @param condition   the condition
         * @param value       the value
         * @param secondValue the second value
         */
        protected Criterion(String condition, Object value, Object secondValue)
        {
            this(condition, value, secondValue, null);
        }
    }
}