package com.sportygames.commons.models;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\b\u001a\u00060\u0005j\u0002`\t*\u00020\n\u001a\u000e\u0010\u000b\u001a\u00020\n*\u00060\u0005j\u0002`\t\u001a\u000e\u0010\f\u001a\u00060\u0001j\u0002`\r*\u00020\n\u001a\u000e\u0010\u000b\u001a\u00020\n*\u00060\u0001j\u0002`\r*\n\u0010\u0000\"\u00020\u00012\u00020\u0001*\n\u0010\u0002\"\u00020\u00032\u00020\u0003*\n\u0010\u0004\"\u00020\u00052\u00020\u0005*\n\u0010\u0006\"\u00020\u00072\u00020\u0007¨\u0006\u000e"}, d2 = {"CommonGiftItem", "Lcom/sportygames/common/ui/model/GiftItem;", "CommonMetadata", "Lcom/sportygames/common/ui/model/Metadata;", "FBGGiftItem", "Lcom/sportygames/fbg_dialog/data/model/GiftItem;", "FBGMetadata", "Lcom/sportygames/fbg_dialog/data/model/Metadata;", "toFBGGiftItem", "Lcom/sportygames/commons/models/FBGGiftItem;", "Lcom/sportygames/commons/models/GiftItem;", "toGiftItem", "toCommonGiftItem", "Lcom/sportygames/commons/models/CommonGiftItem;", "SGLibrary_sportybetRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class GiftItemKt {
    public static final com.sportygames.common.ui.model.GiftItem toCommonGiftItem(GiftItem giftItem) {
        giftItem.getClass();
        double curBal = giftItem.getCurBal();
        String currency = giftItem.getCurrency();
        String displayTitle = giftItem.getDisplayTitle();
        String giftId = giftItem.getGiftId();
        double initBal = giftItem.getInitBal();
        long expireTime = giftItem.getExpireTime();
        int status = giftItem.getStatus();
        Double partialBal = giftItem.getPartialBal();
        Metadata metadata = giftItem.getMetadata();
        String type = metadata != null ? metadata.getType() : null;
        Metadata metadata2 = giftItem.getMetadata();
        return new com.sportygames.common.ui.model.GiftItem(curBal, currency, displayTitle, giftId, initBal, expireTime, status, partialBal, new com.sportygames.common.ui.model.Metadata(type, metadata2 != null ? metadata2.getDisplayName() : null));
    }

    public static final com.sportygames.fbg_dialog.data.model.GiftItem toFBGGiftItem(GiftItem giftItem) {
        giftItem.getClass();
        double curBal = giftItem.getCurBal();
        String currency = giftItem.getCurrency();
        String displayTitle = giftItem.getDisplayTitle();
        String giftId = giftItem.getGiftId();
        double initBal = giftItem.getInitBal();
        long expireTime = giftItem.getExpireTime();
        int status = giftItem.getStatus();
        Double partialBal = giftItem.getPartialBal();
        Metadata metadata = giftItem.getMetadata();
        String type = metadata != null ? metadata.getType() : null;
        Metadata metadata2 = giftItem.getMetadata();
        return new com.sportygames.fbg_dialog.data.model.GiftItem(curBal, currency, displayTitle, giftId, initBal, expireTime, status, partialBal, new com.sportygames.fbg_dialog.data.model.Metadata(type, metadata2 != null ? metadata2.getDisplayName() : null));
    }

    public static final GiftItem toGiftItem(com.sportygames.fbg_dialog.data.model.GiftItem giftItem) {
        giftItem.getClass();
        double curBal = giftItem.getCurBal();
        String currency = giftItem.getCurrency();
        String displayTitle = giftItem.getDisplayTitle();
        String giftId = giftItem.getGiftId();
        double initBal = giftItem.getInitBal();
        long expireTime = giftItem.getExpireTime();
        int status = giftItem.getStatus();
        Double partialBal = giftItem.getPartialBal();
        com.sportygames.fbg_dialog.data.model.Metadata metadata = giftItem.getMetadata();
        String type = metadata != null ? metadata.getType() : null;
        com.sportygames.fbg_dialog.data.model.Metadata metadata2 = giftItem.getMetadata();
        return new GiftItem(curBal, currency, displayTitle, giftId, initBal, expireTime, status, partialBal, new Metadata(type, metadata2 != null ? metadata2.getDisplayName() : null));
    }

    public static final GiftItem toGiftItem(com.sportygames.common.ui.model.GiftItem giftItem) {
        giftItem.getClass();
        double curBal = giftItem.getCurBal();
        String currency = giftItem.getCurrency();
        String displayTitle = giftItem.getDisplayTitle();
        String giftId = giftItem.getGiftId();
        double initBal = giftItem.getInitBal();
        long expireTime = giftItem.getExpireTime();
        int status = giftItem.getStatus();
        Double partialBal = giftItem.getPartialBal();
        com.sportygames.common.ui.model.Metadata metadata = giftItem.getMetadata();
        String type = metadata != null ? metadata.getType() : null;
        com.sportygames.common.ui.model.Metadata metadata2 = giftItem.getMetadata();
        return new GiftItem(curBal, currency, displayTitle, giftId, initBal, expireTime, status, partialBal, new Metadata(type, metadata2 != null ? metadata2.getDisplayName() : null));
    }
}
