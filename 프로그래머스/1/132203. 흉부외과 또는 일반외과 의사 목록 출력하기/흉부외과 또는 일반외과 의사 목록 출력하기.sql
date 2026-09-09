select dr_name,dr_id,mcdp_cd,hire_ymd from doctor
where mcdp_cd like 'GS' || mcdp_cd like 'CS'
order by hire_ymd desc, dr_name asc;