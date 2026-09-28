package com.sporty.android.core.model.dateofbirth;

import defpackage.a1s;
import defpackage.ae80;
import defpackage.bt6;
import defpackage.ce80;
import defpackage.cgo;
import defpackage.d5d;
import defpackage.f78;
import defpackage.fma;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hwr;
import defpackage.hxa;
import defpackage.hxo;
import defpackage.mtg0;
import defpackage.mve;
import defpackage.mx0;
import defpackage.nve;
import defpackage.pd80;
import defpackage.php;
import defpackage.qn4;
import defpackage.ttr;
import defpackage.uts;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ae80
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGBm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u0091\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010HÆ\u0003¢\u0006\u0004\b&\u0010'J\u008e\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0019J\u0010\u0010+\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b+\u0010\u001cJ\u001a\u0010-\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b=\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b>\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b\n\u0010 R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b@\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\bA\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\bB\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\bC\u0010\u0019R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\bD\u0010\u0019R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bF\u0010'¨\u0006I"}, d2 = {"Lcom/sporty/android/core/model/dateofbirth/DobGiftUsablePushData;", "", "", "title", "text", "", "amount", "currency", "linkUrl", "", "isMultiple", "kind", "leastOrderAmount", "usableTime", "expireTime", "srcCtt", "", "bizTypeScope", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen0", "Lce80;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lce80;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "component6", "()Z", "component7", "component8", "component9", "component10", "component11", "component12", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/sporty/android/core/model/dateofbirth/DobGiftUsablePushData;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lfma;", "output", "Lpd80;", "serialDesc", "", "write$Self$model", "(Lcom/sporty/android/core/model/dateofbirth/DobGiftUsablePushData;Lfma;Lpd80;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getText", "I", "getAmount", "getCurrency", "getLinkUrl", "Z", "getKind", "getLeastOrderAmount", "getUsableTime", "getExpireTime", "getSrcCtt", "Ljava/util/List;", "getBizTypeScope", "Companion", "$serializer", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DobGiftUsablePushData {
    private final int amount;
    private final List<Integer> bizTypeScope;
    private final String currency;
    private final String expireTime;
    private final boolean isMultiple;
    private final int kind;
    private final int leastOrderAmount;
    private final String linkUrl;
    private final String srcCtt;
    private final String text;
    private final String title;
    private final String usableTime;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ttr<php<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, hwr.a(a1s.b, new mve(0))};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/core/model/dateofbirth/DobGiftUsablePushData$Companion;", "", "<init>", "()V", "Lphp;", "Lcom/sporty/android/core/model/dateofbirth/DobGiftUsablePushData;", "serializer", "()Lphp;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final php<DobGiftUsablePushData> serializer() {
            return DobGiftUsablePushData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DobGiftUsablePushData(int i, String str, String str2, int i2, String str3, String str4, boolean z, int i3, int i4, String str5, String str6, String str7, List list, ce80 ce80Var) {
        if (4095 != (i & 4095)) {
            cgo.a(i, 4095, DobGiftUsablePushData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.title = str;
        this.text = str2;
        this.amount = i2;
        this.currency = str3;
        this.linkUrl = str4;
        this.isMultiple = z;
        this.kind = i3;
        this.leastOrderAmount = i4;
        this.usableTime = str5;
        this.expireTime = str6;
        this.srcCtt = str7;
        this.bizTypeScope = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ php _childSerializers$_anonymous_() {
        return new mx0(hxo.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DobGiftUsablePushData copy$default(DobGiftUsablePushData dobGiftUsablePushData, String str, String str2, int i, String str3, String str4, boolean z, int i2, int i3, String str5, String str6, String str7, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = dobGiftUsablePushData.title;
        }
        if ((i4 & 2) != 0) {
            str2 = dobGiftUsablePushData.text;
        }
        if ((i4 & 4) != 0) {
            i = dobGiftUsablePushData.amount;
        }
        if ((i4 & 8) != 0) {
            str3 = dobGiftUsablePushData.currency;
        }
        if ((i4 & 16) != 0) {
            str4 = dobGiftUsablePushData.linkUrl;
        }
        if ((i4 & 32) != 0) {
            z = dobGiftUsablePushData.isMultiple;
        }
        if ((i4 & 64) != 0) {
            i2 = dobGiftUsablePushData.kind;
        }
        if ((i4 & 128) != 0) {
            i3 = dobGiftUsablePushData.leastOrderAmount;
        }
        if ((i4 & 256) != 0) {
            str5 = dobGiftUsablePushData.usableTime;
        }
        if ((i4 & 512) != 0) {
            str6 = dobGiftUsablePushData.expireTime;
        }
        if ((i4 & 1024) != 0) {
            str7 = dobGiftUsablePushData.srcCtt;
        }
        if ((i4 & 2048) != 0) {
            list = dobGiftUsablePushData.bizTypeScope;
        }
        String str8 = str7;
        List list2 = list;
        String str9 = str5;
        String str10 = str6;
        int i5 = i2;
        int i6 = i3;
        String str11 = str4;
        boolean z2 = z;
        return dobGiftUsablePushData.copy(str, str2, i, str3, str11, z2, i5, i6, str9, str10, str8, list2);
    }

    public static final /* synthetic */ void write$Self$model(DobGiftUsablePushData self, fma output, pd80 serialDesc) {
        ttr<php<Object>>[] ttrVarArr = $childSerializers;
        output.o(serialDesc, 0, self.title);
        output.o(serialDesc, 1, self.text);
        output.A(2, self.amount, serialDesc);
        output.o(serialDesc, 3, self.currency);
        output.o(serialDesc, 4, self.linkUrl);
        output.i(serialDesc, 5, self.isMultiple);
        output.A(6, self.kind, serialDesc);
        output.A(7, self.leastOrderAmount, serialDesc);
        output.o(serialDesc, 8, self.usableTime);
        output.o(serialDesc, 9, self.expireTime);
        output.o(serialDesc, 10, self.srcCtt);
        output.q(serialDesc, 11, ttrVarArr[11].getValue(), self.bizTypeScope);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getExpireTime() {
        return this.expireTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSrcCtt() {
        return this.srcCtt;
    }

    public final List<Integer> component12() {
        return this.bizTypeScope;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsMultiple() {
        return this.isMultiple;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getKind() {
        return this.kind;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getLeastOrderAmount() {
        return this.leastOrderAmount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUsableTime() {
        return this.usableTime;
    }

    public final DobGiftUsablePushData copy(String title, String text, int amount, String currency, String linkUrl, boolean isMultiple, int kind, int leastOrderAmount, String usableTime, String expireTime, String srcCtt, List<Integer> bizTypeScope) {
        qn4.b(title, text, currency, linkUrl, usableTime);
        expireTime.getClass();
        srcCtt.getClass();
        bizTypeScope.getClass();
        return new DobGiftUsablePushData(title, text, amount, currency, linkUrl, isMultiple, kind, leastOrderAmount, usableTime, expireTime, srcCtt, bizTypeScope);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DobGiftUsablePushData)) {
            return false;
        }
        DobGiftUsablePushData dobGiftUsablePushData = (DobGiftUsablePushData) other;
        return Intrinsics.g(this.title, dobGiftUsablePushData.title) && Intrinsics.g(this.text, dobGiftUsablePushData.text) && this.amount == dobGiftUsablePushData.amount && Intrinsics.g(this.currency, dobGiftUsablePushData.currency) && Intrinsics.g(this.linkUrl, dobGiftUsablePushData.linkUrl) && this.isMultiple == dobGiftUsablePushData.isMultiple && this.kind == dobGiftUsablePushData.kind && this.leastOrderAmount == dobGiftUsablePushData.leastOrderAmount && Intrinsics.g(this.usableTime, dobGiftUsablePushData.usableTime) && Intrinsics.g(this.expireTime, dobGiftUsablePushData.expireTime) && Intrinsics.g(this.srcCtt, dobGiftUsablePushData.srcCtt) && Intrinsics.g(this.bizTypeScope, dobGiftUsablePushData.bizTypeScope);
    }

    public final int getAmount() {
        return this.amount;
    }

    public final List<Integer> getBizTypeScope() {
        return this.bizTypeScope;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getExpireTime() {
        return this.expireTime;
    }

    public final int getKind() {
        return this.kind;
    }

    public final int getLeastOrderAmount() {
        return this.leastOrderAmount;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final String getSrcCtt() {
        return this.srcCtt;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUsableTime() {
        return this.usableTime;
    }

    public int hashCode() {
        return this.bizTypeScope.hashCode() + gmf0.a(gmf0.a(gmf0.a(gpp.a(this.leastOrderAmount, gpp.a(this.kind, mtg0.a(gmf0.a(gmf0.a(gpp.a(this.amount, gmf0.a(this.title.hashCode() * 31, 31, this.text), 31), 31, this.currency), 31, this.linkUrl), 31, this.isMultiple), 31), 31), 31, this.usableTime), 31, this.expireTime), 31, this.srcCtt);
    }

    public final boolean isMultiple() {
        return this.isMultiple;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.text;
        int i = this.amount;
        String str3 = this.currency;
        String str4 = this.linkUrl;
        boolean z = this.isMultiple;
        int i2 = this.kind;
        int i3 = this.leastOrderAmount;
        String str5 = this.usableTime;
        String str6 = this.expireTime;
        String str7 = this.srcCtt;
        List<Integer> list = this.bizTypeScope;
        StringBuilder sbA = ux5.a("DobGiftUsablePushData(title=", str, ", text=", str2, ", amount=");
        f78.b(i, ", currency=", str3, ", linkUrl=", sbA);
        uts.b(str4, ", isMultiple=", ", kind=", sbA, z);
        d5d.a(sbA, i2, ", leastOrderAmount=", i3, ", usableTime=");
        hxa.c(sbA, str5, ", expireTime=", str6, ", srcCtt=");
        return nve.a(str7, ", bizTypeScope=", ")", sbA, list);
    }

    public DobGiftUsablePushData(String str, String str2, int i, String str3, String str4, boolean z, int i2, int i3, String str5, String str6, String str7, List<Integer> list) {
        qn4.b(str, str2, str3, str4, str5);
        bt6.a(str6, str7, list);
        this.title = str;
        this.text = str2;
        this.amount = i;
        this.currency = str3;
        this.linkUrl = str4;
        this.isMultiple = z;
        this.kind = i2;
        this.leastOrderAmount = i3;
        this.usableTime = str5;
        this.expireTime = str6;
        this.srcCtt = str7;
        this.bizTypeScope = list;
    }
}
