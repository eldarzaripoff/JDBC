SELECT o.product_name
FROM netology.orders o
JOIN netology.customers c ON c.id = o.customer_id
WHERE LOWER(c.name) = LOWER(:name);