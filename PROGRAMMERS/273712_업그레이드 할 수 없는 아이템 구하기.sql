select a.ITEM_ID, b.ITEM_NAME, b.RARITY
from ITEM_TREE a
inner join ITEM_INFO b
        on a.item_id = b.item_id
where a.ITEM_ID not in (
                    select PARENT_ITEM_ID
                    from ITEM_TREE
                    where PARENT_ITEM_ID is not null)
order by a.ITEM_ID desc;