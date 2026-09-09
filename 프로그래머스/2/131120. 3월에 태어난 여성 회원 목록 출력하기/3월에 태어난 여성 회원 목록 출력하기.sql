select member_id,member_name,gender,date_of_birth from member_profile
where tlno is not null && Month(date_of_birth) like 03 && gender like "W";