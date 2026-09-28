package com.sporty.android.core.model.pay;

import defpackage.dy5;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.uf80;
import defpackage.wxa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fÊ\u0001\u0002\b\u001e¨\u0006\u001d"}, d2 = {"Lcom/sporty/android/core/model/pay/QuickInput;", "", "amount", "", "bounty", "btnText", "", "order", "text", "<init>", "(IILjava/lang/String;ILjava/lang/String;)V", "getAmount", "()I", "getBounty", "getBtnText", "()Ljava/lang/String;", "getOrder", "getText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class QuickInput {
    private final int amount;
    private final int bounty;
    private final String btnText;
    private final int order;
    private final String text;

    public QuickInput(int i, int i2, String str, int i3, String str2) {
        str.getClass();
        str2.getClass();
        this.amount = i;
        this.bounty = i2;
        this.btnText = str;
        this.order = i3;
        this.text = str2;
    }

    public static /* synthetic */ QuickInput copy$default(QuickInput quickInput, int i, int i2, String str, int i3, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = quickInput.amount;
        }
        if ((i4 & 2) != 0) {
            i2 = quickInput.bounty;
        }
        if ((i4 & 4) != 0) {
            str = quickInput.btnText;
        }
        if ((i4 & 8) != 0) {
            i3 = quickInput.order;
        }
        if ((i4 & 16) != 0) {
            str2 = quickInput.text;
        }
        String str3 = str2;
        String str4 = str;
        return quickInput.copy(i, i2, str4, i3, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBounty() {
        return this.bounty;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBtnText() {
        return this.btnText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final QuickInput copy(int amount, int bounty, String btnText, int order, String text) {
        btnText.getClass();
        text.getClass();
        return new QuickInput(amount, bounty, btnText, order, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickInput)) {
            return false;
        }
        QuickInput quickInput = (QuickInput) other;
        return this.amount == quickInput.amount && this.bounty == quickInput.bounty && Intrinsics.g(this.btnText, quickInput.btnText) && this.order == quickInput.order && Intrinsics.g(this.text, quickInput.text);
    }

    public final int getAmount() {
        return this.amount;
    }

    public final int getBounty() {
        return this.bounty;
    }

    public final String getBtnText() {
        return this.btnText;
    }

    public final int getOrder() {
        return this.order;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + gpp.a(this.order, gmf0.a(gpp.a(this.bounty, Integer.hashCode(this.amount) * 31, 31), 31, this.btnText), 31);
    }

    public String toString() {
        int i = this.amount;
        int i2 = this.bounty;
        String str = this.btnText;
        int i3 = this.order;
        String str2 = this.text;
        StringBuilder sbA = dy5.a("QuickInput(amount=", i, i2, ", bounty=", ", btnText=");
        wxa.b(i3, str, ", order=", ", text=", sbA);
        return uf80.a(sbA, str2, ")");
    }
}
