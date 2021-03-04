SELECT
     route_info.`id` AS route_info_id,
     route_info.`route_no` AS route_info_route_no,
     route_info.`no_of_stop` AS route_info_no_of_stop,
     route_info.`start` AS route_info_start,
     route_info.`stop` AS route_info_stop,
     route_info.`start_time` AS route_info_start_time,
     route_info.`stop_time` AS route_info_stop_time
FROM
     `route_info` route_info