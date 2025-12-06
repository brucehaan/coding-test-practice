select t.emp_no
    , t.emp_name
    , (case
         when t.a >= 96 then 'S'
         when t.a >= 90 then 'A'
         when t.a >= 80 then 'B'
         else 'C'
      end) as GRADE
    , case
         when t.a >= 96 then t.sal * 0.2
         when t.a >= 90 then t.sal * 0.15
         when t.a >= 80 then t.sal * 0.1
         else t.sal * 0.0
      end as BONUS
from (select emp.emp_no
        , emp.emp_name
        , avg(gra.SCORE) as a
        , emp.sal
    from HR_EMPLOYEES emp
    inner join HR_GRADE gra
            on emp.EMP_NO = gra.EMP_NO
    group by emp.emp_no, emp.emp_name, emp.sal
) t
order by t.EMP_NO asc

/*
        , case
             when gra.SCORE >= 96 then emp.sal * 0.2
             when gra.SCORE >= 90 then emp.sal * 0.15
             when gra.SCORE >= 80 then emp.sal * 0.1
             else emp.sal * 0.0
          end as b*/
