package com.sportygames.pocketrocket.model.request;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001a\u0010\"\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001e¨\u0006%"}, d2 = {"Lcom/sportygames/pocketrocket/model/request/CashoutLayoutForChat;", "", "<init>", "()V", "redBetPlaced", "", "getRedBetPlaced", "()Z", "setRedBetPlaced", "(Z)V", "purpleBetPlaced", "getPurpleBetPlaced", "setPurpleBetPlaced", "blueBetPlaced", "getBlueBetPlaced", "setBlueBetPlaced", "cashOutRedRocketVisibility", "getCashOutRedRocketVisibility", "setCashOutRedRocketVisibility", "cashOutPurpleRocketVisibility", "getCashOutPurpleRocketVisibility", "setCashOutPurpleRocketVisibility", "cashOutBlueRocketVisibility", "getCashOutBlueRocketVisibility", "setCashOutBlueRocketVisibility", "cashOutAmountRed", "", "getCashOutAmountRed", "()Ljava/lang/String;", "setCashOutAmountRed", "(Ljava/lang/String;)V", "cashOutAmountPurple", "getCashOutAmountPurple", "setCashOutAmountPurple", "cashOutAmountBlue", "getCashOutAmountBlue", "setCashOutAmountBlue", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CashoutLayoutForChat {
    public static final int $stable = 8;
    private boolean blueBetPlaced;
    private boolean cashOutBlueRocketVisibility;
    private boolean cashOutPurpleRocketVisibility;
    private boolean cashOutRedRocketVisibility;
    private boolean purpleBetPlaced;
    private boolean redBetPlaced;
    private String cashOutAmountRed = "";
    private String cashOutAmountPurple = "";
    private String cashOutAmountBlue = "";

    public final boolean getBlueBetPlaced() {
        return this.blueBetPlaced;
    }

    public final String getCashOutAmountBlue() {
        return this.cashOutAmountBlue;
    }

    public final String getCashOutAmountPurple() {
        return this.cashOutAmountPurple;
    }

    public final String getCashOutAmountRed() {
        return this.cashOutAmountRed;
    }

    public final boolean getCashOutBlueRocketVisibility() {
        return this.cashOutBlueRocketVisibility;
    }

    public final boolean getCashOutPurpleRocketVisibility() {
        return this.cashOutPurpleRocketVisibility;
    }

    public final boolean getCashOutRedRocketVisibility() {
        return this.cashOutRedRocketVisibility;
    }

    public final boolean getPurpleBetPlaced() {
        return this.purpleBetPlaced;
    }

    public final boolean getRedBetPlaced() {
        return this.redBetPlaced;
    }

    public final void setBlueBetPlaced(boolean z) {
        this.blueBetPlaced = z;
    }

    public final void setCashOutAmountBlue(String str) {
        str.getClass();
        this.cashOutAmountBlue = str;
    }

    public final void setCashOutAmountPurple(String str) {
        str.getClass();
        this.cashOutAmountPurple = str;
    }

    public final void setCashOutAmountRed(String str) {
        str.getClass();
        this.cashOutAmountRed = str;
    }

    public final void setCashOutBlueRocketVisibility(boolean z) {
        this.cashOutBlueRocketVisibility = z;
    }

    public final void setCashOutPurpleRocketVisibility(boolean z) {
        this.cashOutPurpleRocketVisibility = z;
    }

    public final void setCashOutRedRocketVisibility(boolean z) {
        this.cashOutRedRocketVisibility = z;
    }

    public final void setPurpleBetPlaced(boolean z) {
        this.purpleBetPlaced = z;
    }

    public final void setRedBetPlaced(boolean z) {
        this.redBetPlaced = z;
    }
}
