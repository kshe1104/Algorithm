
select pt_name,pt_no,gend_cd,age,ifnull(tlno,'NONE') from patient
where gend_cd like 'W' && age<=12
order by age desc,pt_name asc;