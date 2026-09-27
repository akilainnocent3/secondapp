package com.chartboost.sdk.impl;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.iab.omid.library.chartboost.adsession.FriendlyObstructionPurpose;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class sk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final sk f40916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final sk f40917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final sk f40918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final sk f40919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final sk f40920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final sk f40921h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final sk f40922i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final sk f40923j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final sk f40924k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final sk f40925l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final sk f40926m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ sk[] f40927n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ sr.a f40928o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FriendlyObstructionPurpose f40929b;

    static {
        FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.VIDEO_CONTROLS;
        f40916c = new sk("VIDEO_CONTROLS", 0, friendlyObstructionPurpose);
        f40917d = new sk("CLOSE_BUTTON", 1, FriendlyObstructionPurpose.CLOSE_AD);
        FriendlyObstructionPurpose friendlyObstructionPurpose2 = FriendlyObstructionPurpose.OTHER;
        f40918e = new sk("CTA_BUTTON", 2, friendlyObstructionPurpose2);
        f40919f = new sk("SKIP_BUTTON", 3, friendlyObstructionPurpose);
        f40920g = new sk("INDUSTRY_ICON", 4, friendlyObstructionPurpose2);
        f40921h = new sk("COUNTDOWN_TIMER", 5, friendlyObstructionPurpose2);
        FriendlyObstructionPurpose friendlyObstructionPurpose3 = FriendlyObstructionPurpose.NOT_VISIBLE;
        f40922i = new sk("OVERLAY", 6, friendlyObstructionPurpose3);
        f40923j = new sk("BLUR", 7, friendlyObstructionPurpose2);
        f40924k = new sk("PROGRESS_BAR", 8, friendlyObstructionPurpose2);
        f40925l = new sk("NOT_VISIBLE", 9, friendlyObstructionPurpose3);
        f40926m = new sk(NativeAdContent.ViewTag.OTHER, 10, friendlyObstructionPurpose2);
        sk[] skVarArrA = a();
        f40927n = skVarArrA;
        f40928o = sr.c.c(skVarArrA);
    }

    public sk(String str, int i10, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        super(str, i10);
        this.f40929b = friendlyObstructionPurpose;
    }

    public static final /* synthetic */ sk[] a() {
        return new sk[]{f40916c, f40917d, f40918e, f40919f, f40920g, f40921h, f40922i, f40923j, f40924k, f40925l, f40926m};
    }

    public static sk valueOf(String str) {
        return (sk) Enum.valueOf(sk.class, str);
    }

    public static sk[] values() {
        return (sk[]) f40927n.clone();
    }

    public final FriendlyObstructionPurpose b() {
        return this.f40929b;
    }
}
