__on_player_uses_item(player, item_tuple, hand) -> (
    _run_item_command(player,hand),
);
_run_item_command(player, hand) ->
(
    item = query(player,'holds',hand);
    if(item==null,
        return(null);,
        l(itemtype,count,nbt) = item;
    );
    check = get(nbt, 'command');
    run(check);
    return(null);
);
