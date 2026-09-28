package com.sportygames.crash.models;

import com.sportybet.android.gp.tz.R;
import defpackage.j58;
import defpackage.mz1;
import defpackage.r58;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bQ\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005BA\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\rB\u008d\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000e\u0012\b\b\u0002\u0010 \u001a\u00020\u000e\u0012\b\b\u0002\u0010!\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\"\u001a\u00020\u000e\u0012\b\b\u0002\u0010#\u001a\u00020\u000e\u0012\b\b\u0002\u0010$\u001a\u00020\u000e\u0012\b\b\u0002\u0010%\u001a\u00020\u000e\u0012\b\b\u0002\u0010&\u001a\u00020\u000e\u0012\b\b\u0002\u0010'\u001a\u00020\u000e\u0012\b\b\u0002\u0010(\u001a\u00020\u000e\u0012\b\b\u0002\u0010)\u001a\u00020\u000e\u0012\b\b\u0002\u0010*\u001a\u00020\u000e\u0012\b\b\u0002\u0010+\u001a\u00020\u000e\u0012\b\b\u0002\u0010,\u001a\u00020\u000e\u0012\b\b\u0002\u0010-\u001a\u00020\u000e\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010.\u001a\u00020\u000e\u0012\b\b\u0002\u0010/\u001a\u00020\u000e\u0012\b\b\u0002\u00100\u001a\u00020\u000e¢\u0006\u0004\b\u0004\u00101R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u0010\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b5\u00104R\u001a\u0010\u0011\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b6\u00104R\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b7\u00104R\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b8\u00104R\u001a\u0010\u0014\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u00102\u001a\u0004\b9\u00104R\u001a\u0010\u0015\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u00102\u001a\u0004\b:\u00104R\u001a\u0010\u0016\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u00102\u001a\u0004\b;\u00104R\u001a\u0010\u0017\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u00102\u001a\u0004\b<\u00104R\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u00102\u001a\u0004\b=\u00104R\u001a\u0010\u0019\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u00102\u001a\u0004\b>\u00104R\u001a\u0010\u001a\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u00102\u001a\u0004\b?\u00104R\u001a\u0010\u001b\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u00102\u001a\u0004\b@\u00104R\u001a\u0010\u001c\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\bA\u00104R\u001a\u0010\u001d\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u00102\u001a\u0004\bB\u00104R\u001a\u0010\u001e\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u00102\u001a\u0004\bC\u00104R\u001a\u0010\u001f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u00102\u001a\u0004\bD\u00104R\u001a\u0010 \u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u00102\u001a\u0004\bE\u00104R\u001a\u0010!\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u00102\u001a\u0004\bF\u00104R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010\"\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u00102\u001a\u0004\bJ\u00104R\u001a\u0010#\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u00102\u001a\u0004\bK\u00104R\u001a\u0010$\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u00102\u001a\u0004\bL\u00104R\u001a\u0010%\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u00102\u001a\u0004\bM\u00104R\u001a\u0010&\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u00102\u001a\u0004\bN\u00104R\u001a\u0010'\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u00102\u001a\u0004\bO\u00104R\u001a\u0010(\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u00102\u001a\u0004\bP\u00104R\u001a\u0010)\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u00102\u001a\u0004\bQ\u00104R\u001a\u0010*\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u00102\u001a\u0004\bR\u00104R\u001a\u0010+\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\bS\u00104R\u001a\u0010,\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u00102\u001a\u0004\bT\u00104R\u001a\u0010-\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u00102\u001a\u0004\bU\u00104R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010V\u001a\u0004\bW\u0010XR\u001a\u0010\n\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bY\u0010IR\u001a\u0010\u000b\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010V\u001a\u0004\bZ\u0010XR\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010G\u001a\u0004\b[\u0010IR\u001a\u0010.\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u00102\u001a\u0004\b\\\u00104R\u001a\u0010/\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00102\u001a\u0004\b]\u00104R\u001a\u00100\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b^\u00104¨\u0006_"}, d2 = {"Lcom/sportygames/crash/models/BetComponentColors;", "", "Lmz1;", "base", "<init>", "(Lmz1;)V", "", "plusMinusCircular", "", "minusIconDrawableRes", "minusIconHasContainer", "plusIconDrawableRes", "plusIconHasContainer", "(Lmz1;ZIZIZ)V", "Lj58;", "plusMinusEnableBorder", "plusMinusDisableBorder", "backgroundSecondaryBorder", "backgroundPrimary", "backgroundSecondary", "backgroundTertiary", "backgroundTertiaryBorder", "backgroundDisabled", "brFbgColor", "brFbgBorderColor", "selectedFbgBorderColor", "textPrimary", "textSecondary", "textTertiary", "buttonPrimary", "buttonSecondary", "switchActiveTrack", "switchInactiveTrack", "switchThumb", "waitingButtonBorderColor", "cashoutButtonBorderColor", "cashoutButtonColor1", "cashoutButtonColor2", "cashoutButtonGradientColor", "otbBetCloseBorderColor", "otbBetCloseColor1", "otbBetCloseColor2", "quickBetChipsBG", "quickBetChipsBorder", "placeBetOTBTitleColor", "placeBetOTBTitleBorderColor", "cashoutBoxBorderOff", "betCardBorderColor", "betCardCashoutBorederColor", "(JJJJJJJJJJJJJJJJJJJZJJJJJJJJJJJJIZIZJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "getPlusMinusEnableBorder-0d7_KjU", "()J", "getPlusMinusDisableBorder-0d7_KjU", "getBackgroundSecondaryBorder-0d7_KjU", "getBackgroundPrimary-0d7_KjU", "getBackgroundSecondary-0d7_KjU", "getBackgroundTertiary-0d7_KjU", "getBackgroundTertiaryBorder-0d7_KjU", "getBackgroundDisabled-0d7_KjU", "getBrFbgColor-0d7_KjU", "getBrFbgBorderColor-0d7_KjU", "getSelectedFbgBorderColor-0d7_KjU", "getTextPrimary-0d7_KjU", "getTextSecondary-0d7_KjU", "getTextTertiary-0d7_KjU", "getButtonPrimary-0d7_KjU", "getButtonSecondary-0d7_KjU", "getSwitchActiveTrack-0d7_KjU", "getSwitchInactiveTrack-0d7_KjU", "getSwitchThumb-0d7_KjU", "Z", "getPlusMinusCircular", "()Z", "getWaitingButtonBorderColor-0d7_KjU", "getCashoutButtonBorderColor-0d7_KjU", "getCashoutButtonColor1-0d7_KjU", "getCashoutButtonColor2-0d7_KjU", "getCashoutButtonGradientColor-0d7_KjU", "getOtbBetCloseBorderColor-0d7_KjU", "getOtbBetCloseColor1-0d7_KjU", "getOtbBetCloseColor2-0d7_KjU", "getQuickBetChipsBG-0d7_KjU", "getQuickBetChipsBorder-0d7_KjU", "getPlaceBetOTBTitleColor-0d7_KjU", "getPlaceBetOTBTitleBorderColor-0d7_KjU", "I", "getMinusIconDrawableRes", "()I", "getMinusIconHasContainer", "getPlusIconDrawableRes", "getPlusIconHasContainer", "getCashoutBoxBorderOff-0d7_KjU", "getBetCardBorderColor-0d7_KjU", "getBetCardCashoutBorederColor-0d7_KjU", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class BetComponentColors {
    public static final int $stable = 0;
    private final long backgroundDisabled;
    private final long backgroundPrimary;
    private final long backgroundSecondary;
    private final long backgroundSecondaryBorder;
    private final long backgroundTertiary;
    private final long backgroundTertiaryBorder;
    private final long betCardBorderColor;
    private final long betCardCashoutBorederColor;
    private final long brFbgBorderColor;
    private final long brFbgColor;
    private final long buttonPrimary;
    private final long buttonSecondary;
    private final long cashoutBoxBorderOff;
    private final long cashoutButtonBorderColor;
    private final long cashoutButtonColor1;
    private final long cashoutButtonColor2;
    private final long cashoutButtonGradientColor;
    private final int minusIconDrawableRes;
    private final boolean minusIconHasContainer;
    private final long otbBetCloseBorderColor;
    private final long otbBetCloseColor1;
    private final long otbBetCloseColor2;
    private final long placeBetOTBTitleBorderColor;
    private final long placeBetOTBTitleColor;
    private final int plusIconDrawableRes;
    private final boolean plusIconHasContainer;
    private final boolean plusMinusCircular;
    private final long plusMinusDisableBorder;
    private final long plusMinusEnableBorder;
    private final long quickBetChipsBG;
    private final long quickBetChipsBorder;
    private final long selectedFbgBorderColor;
    private final long switchActiveTrack;
    private final long switchInactiveTrack;
    private final long switchThumb;
    private final long textPrimary;
    private final long textSecondary;
    private final long textTertiary;
    private final long waitingButtonBorderColor;

    /* JADX WARN: Illegal instructions before constructor call */
    public BetComponentColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, boolean z, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, int i, boolean z2, int i2, boolean z3, long j32, long j33, long j34, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        long j40;
        long j41;
        long j42;
        long j43;
        long j44 = (i3 & 1) != 0 ? new mz1().H0 : j;
        long j45 = (i3 & 2) != 0 ? new mz1().I0 : j2;
        long j46 = (i3 & 4) != 0 ? new mz1().F0 : j3;
        long j47 = (i3 & 8) != 0 ? new mz1().f : j4;
        long j48 = (i3 & 16) != 0 ? new mz1().g : j5;
        long j49 = (i3 & 32) != 0 ? new mz1().h : j6;
        long j50 = (i3 & 64) != 0 ? new mz1().G0 : j7;
        long j51 = (i3 & 128) != 0 ? new mz1().i : j8;
        long j52 = (i3 & 256) != 0 ? new mz1().C0 : j9;
        long j53 = (i3 & 512) != 0 ? new mz1().D0 : j10;
        long j54 = (i3 & 1024) != 0 ? new mz1().E0 : j11;
        long j55 = (i3 & 2048) != 0 ? new mz1().c : j12;
        long j56 = (i3 & 4096) != 0 ? new mz1().d : j13;
        long j57 = (i3 & 8192) != 0 ? new mz1().a : j14;
        long j58 = (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? new mz1().b : j15;
        long j59 = (i3 & 32768) != 0 ? new mz1().g : j16;
        long j60 = (i3 & 65536) != 0 ? new mz1().b : j17;
        long j61 = (i3 & 131072) != 0 ? new mz1().e : j18;
        long j62 = (i3 & 262144) != 0 ? new mz1().c : j19;
        boolean z4 = (i3 & 524288) != 0 ? false : z;
        if ((i3 & 1048576) != 0) {
            int i5 = j58.n;
            j35 = j58.l;
        } else {
            j35 = j20;
        }
        if ((i3 & 2097152) != 0) {
            int i6 = j58.n;
            j36 = j58.l;
        } else {
            j36 = j21;
        }
        if ((i3 & 4194304) != 0) {
            int i7 = j58.n;
            j37 = j58.l;
        } else {
            j37 = j22;
        }
        if ((i3 & 8388608) != 0) {
            int i8 = j58.n;
            j38 = j58.l;
        } else {
            j38 = j23;
        }
        if ((i3 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0) {
            int i9 = j58.n;
            j39 = j58.l;
        } else {
            j39 = j24;
        }
        if ((i3 & 33554432) != 0) {
            int i10 = j58.n;
            j40 = j58.l;
        } else {
            j40 = j25;
        }
        if ((i3 & 67108864) != 0) {
            int i11 = j58.n;
            j41 = j58.l;
        } else {
            j41 = j26;
        }
        if ((i3 & 134217728) != 0) {
            int i12 = j58.n;
            j42 = j58.l;
        } else {
            j42 = j27;
        }
        long jD = (i3 & 268435456) != 0 ? r58.d(4280427300L) : j28;
        long jD2 = (i3 & 536870912) != 0 ? r58.d(4280427300L) : j29;
        long jD3 = (i3 & 1073741824) != 0 ? r58.d(4281808954L) : j30;
        long jD4 = (i3 & Integer.MIN_VALUE) != 0 ? r58.d(4281808954L) : j31;
        int i13 = (i4 & 1) != 0 ? R.drawable.ic_minus : i;
        boolean z5 = (i4 & 2) != 0 ? false : z2;
        int i14 = (i4 & 4) != 0 ? R.drawable.ic_plus : i2;
        boolean z6 = (i4 & 8) == 0 ? z3 : false;
        if ((i4 & 16) != 0) {
            int i15 = j58.n;
            j43 = j58.f;
        } else {
            j43 = j32;
        }
        long j63 = jD3;
        long j64 = j51;
        long j65 = j52;
        long j66 = j53;
        long j67 = j54;
        long j68 = j45;
        long j69 = j46;
        long j70 = j47;
        long j71 = j44;
        this(j71, j68, j69, j70, j48, j49, j50, j64, j65, j66, j67, j55, j56, j57, j58, j59, j60, j61, j62, z4, j35, j36, j37, j38, j39, j40, j41, j42, jD, jD2, j63, jD4, i13, z5, i14, z6, j43, (i4 & 32) != 0 ? r58.d(4281545523L) : j33, (i4 & 64) != 0 ? r58.d(4288177153L) : j34, null);
    }

    /* JADX INFO: renamed from: getBackgroundDisabled-0d7_KjU, reason: not valid java name and from getter */
    public long getBackgroundDisabled() {
        return this.backgroundDisabled;
    }

    /* JADX INFO: renamed from: getBackgroundPrimary-0d7_KjU, reason: not valid java name and from getter */
    public long getBackgroundPrimary() {
        return this.backgroundPrimary;
    }

    /* JADX INFO: renamed from: getBackgroundSecondary-0d7_KjU, reason: not valid java name and from getter */
    public long getBackgroundSecondary() {
        return this.backgroundSecondary;
    }

    /* JADX INFO: renamed from: getBackgroundSecondaryBorder-0d7_KjU, reason: not valid java name and from getter */
    public long getBackgroundSecondaryBorder() {
        return this.backgroundSecondaryBorder;
    }

    /* JADX INFO: renamed from: getBackgroundTertiary-0d7_KjU, reason: not valid java name and from getter */
    public long getBackgroundTertiary() {
        return this.backgroundTertiary;
    }

    /* JADX INFO: renamed from: getBackgroundTertiaryBorder-0d7_KjU, reason: not valid java name and from getter */
    public long getBackgroundTertiaryBorder() {
        return this.backgroundTertiaryBorder;
    }

    /* JADX INFO: renamed from: getBetCardBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public long getBetCardBorderColor() {
        return this.betCardBorderColor;
    }

    /* JADX INFO: renamed from: getBetCardCashoutBorederColor-0d7_KjU, reason: not valid java name and from getter */
    public long getBetCardCashoutBorederColor() {
        return this.betCardCashoutBorederColor;
    }

    /* JADX INFO: renamed from: getBrFbgBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public long getBrFbgBorderColor() {
        return this.brFbgBorderColor;
    }

    /* JADX INFO: renamed from: getBrFbgColor-0d7_KjU, reason: not valid java name and from getter */
    public long getBrFbgColor() {
        return this.brFbgColor;
    }

    /* JADX INFO: renamed from: getButtonPrimary-0d7_KjU, reason: not valid java name and from getter */
    public long getButtonPrimary() {
        return this.buttonPrimary;
    }

    /* JADX INFO: renamed from: getButtonSecondary-0d7_KjU, reason: not valid java name and from getter */
    public long getButtonSecondary() {
        return this.buttonSecondary;
    }

    /* JADX INFO: renamed from: getCashoutBoxBorderOff-0d7_KjU, reason: not valid java name and from getter */
    public long getCashoutBoxBorderOff() {
        return this.cashoutBoxBorderOff;
    }

    /* JADX INFO: renamed from: getCashoutButtonBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public long getCashoutButtonBorderColor() {
        return this.cashoutButtonBorderColor;
    }

    /* JADX INFO: renamed from: getCashoutButtonColor1-0d7_KjU, reason: not valid java name and from getter */
    public long getCashoutButtonColor1() {
        return this.cashoutButtonColor1;
    }

    /* JADX INFO: renamed from: getCashoutButtonColor2-0d7_KjU, reason: not valid java name and from getter */
    public long getCashoutButtonColor2() {
        return this.cashoutButtonColor2;
    }

    /* JADX INFO: renamed from: getCashoutButtonGradientColor-0d7_KjU, reason: not valid java name and from getter */
    public long getCashoutButtonGradientColor() {
        return this.cashoutButtonGradientColor;
    }

    public int getMinusIconDrawableRes() {
        return this.minusIconDrawableRes;
    }

    public boolean getMinusIconHasContainer() {
        return this.minusIconHasContainer;
    }

    /* JADX INFO: renamed from: getOtbBetCloseBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public long getOtbBetCloseBorderColor() {
        return this.otbBetCloseBorderColor;
    }

    /* JADX INFO: renamed from: getOtbBetCloseColor1-0d7_KjU, reason: not valid java name and from getter */
    public long getOtbBetCloseColor1() {
        return this.otbBetCloseColor1;
    }

    /* JADX INFO: renamed from: getOtbBetCloseColor2-0d7_KjU, reason: not valid java name and from getter */
    public long getOtbBetCloseColor2() {
        return this.otbBetCloseColor2;
    }

    /* JADX INFO: renamed from: getPlaceBetOTBTitleBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public long getPlaceBetOTBTitleBorderColor() {
        return this.placeBetOTBTitleBorderColor;
    }

    /* JADX INFO: renamed from: getPlaceBetOTBTitleColor-0d7_KjU, reason: not valid java name and from getter */
    public long getPlaceBetOTBTitleColor() {
        return this.placeBetOTBTitleColor;
    }

    public int getPlusIconDrawableRes() {
        return this.plusIconDrawableRes;
    }

    public boolean getPlusIconHasContainer() {
        return this.plusIconHasContainer;
    }

    public boolean getPlusMinusCircular() {
        return this.plusMinusCircular;
    }

    /* JADX INFO: renamed from: getPlusMinusDisableBorder-0d7_KjU, reason: not valid java name and from getter */
    public long getPlusMinusDisableBorder() {
        return this.plusMinusDisableBorder;
    }

    /* JADX INFO: renamed from: getPlusMinusEnableBorder-0d7_KjU, reason: not valid java name and from getter */
    public long getPlusMinusEnableBorder() {
        return this.plusMinusEnableBorder;
    }

    /* JADX INFO: renamed from: getQuickBetChipsBG-0d7_KjU, reason: not valid java name and from getter */
    public long getQuickBetChipsBG() {
        return this.quickBetChipsBG;
    }

    /* JADX INFO: renamed from: getQuickBetChipsBorder-0d7_KjU, reason: not valid java name and from getter */
    public long getQuickBetChipsBorder() {
        return this.quickBetChipsBorder;
    }

    /* JADX INFO: renamed from: getSelectedFbgBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public long getSelectedFbgBorderColor() {
        return this.selectedFbgBorderColor;
    }

    /* JADX INFO: renamed from: getSwitchActiveTrack-0d7_KjU, reason: not valid java name and from getter */
    public long getSwitchActiveTrack() {
        return this.switchActiveTrack;
    }

    /* JADX INFO: renamed from: getSwitchInactiveTrack-0d7_KjU, reason: not valid java name and from getter */
    public long getSwitchInactiveTrack() {
        return this.switchInactiveTrack;
    }

    /* JADX INFO: renamed from: getSwitchThumb-0d7_KjU, reason: not valid java name and from getter */
    public long getSwitchThumb() {
        return this.switchThumb;
    }

    /* JADX INFO: renamed from: getTextPrimary-0d7_KjU, reason: not valid java name and from getter */
    public long getTextPrimary() {
        return this.textPrimary;
    }

    /* JADX INFO: renamed from: getTextSecondary-0d7_KjU, reason: not valid java name and from getter */
    public long getTextSecondary() {
        return this.textSecondary;
    }

    /* JADX INFO: renamed from: getTextTertiary-0d7_KjU, reason: not valid java name and from getter */
    public long getTextTertiary() {
        return this.textTertiary;
    }

    /* JADX INFO: renamed from: getWaitingButtonBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public long getWaitingButtonBorderColor() {
        return this.waitingButtonBorderColor;
    }

    private BetComponentColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, boolean z, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, int i, boolean z2, int i2, boolean z3, long j32, long j33, long j34) {
        this.plusMinusEnableBorder = j;
        this.plusMinusDisableBorder = j2;
        this.backgroundSecondaryBorder = j3;
        this.backgroundPrimary = j4;
        this.backgroundSecondary = j5;
        this.backgroundTertiary = j6;
        this.backgroundTertiaryBorder = j7;
        this.backgroundDisabled = j8;
        this.brFbgColor = j9;
        this.brFbgBorderColor = j10;
        this.selectedFbgBorderColor = j11;
        this.textPrimary = j12;
        this.textSecondary = j13;
        this.textTertiary = j14;
        this.buttonPrimary = j15;
        this.buttonSecondary = j16;
        this.switchActiveTrack = j17;
        this.switchInactiveTrack = j18;
        this.switchThumb = j19;
        this.plusMinusCircular = z;
        this.waitingButtonBorderColor = j20;
        this.cashoutButtonBorderColor = j21;
        this.cashoutButtonColor1 = j22;
        this.cashoutButtonColor2 = j23;
        this.cashoutButtonGradientColor = j24;
        this.otbBetCloseBorderColor = j25;
        this.otbBetCloseColor1 = j26;
        this.otbBetCloseColor2 = j27;
        this.quickBetChipsBG = j28;
        this.quickBetChipsBorder = j29;
        this.placeBetOTBTitleColor = j30;
        this.placeBetOTBTitleBorderColor = j31;
        this.minusIconDrawableRes = i;
        this.minusIconHasContainer = z2;
        this.plusIconDrawableRes = i2;
        this.plusIconHasContainer = z3;
        this.cashoutBoxBorderOff = j32;
        this.betCardBorderColor = j33;
        this.betCardCashoutBorederColor = j34;
    }

    public /* synthetic */ BetComponentColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, boolean z, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, int i, boolean z2, int i2, boolean z3, long j32, long j33, long j34, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, z, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, i, z2, i2, z3, j32, j33, j34);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BetComponentColors(mz1 mz1Var) {
        this(mz1Var, false, 0, false, 0, false, 60, null);
        mz1Var.getClass();
    }

    public /* synthetic */ BetComponentColors(mz1 mz1Var, boolean z, int i, boolean z2, int i2, boolean z3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(mz1Var, z, (i3 & 4) != 0 ? R.drawable.ic_minus : i, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? R.drawable.ic_plus : i2, (i3 & 32) != 0 ? false : z3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BetComponentColors(mz1 mz1Var, boolean z, int i, boolean z2, int i2, boolean z3) {
        this(mz1Var.q0(), mz1Var.p0(), mz1Var.i(), mz1Var.c(), mz1Var.g(), mz1Var.f(), mz1Var.j(), mz1Var.d(), mz1Var.z(), mz1Var.y(), mz1Var.F0(), mz1Var.M0(), mz1Var.f0(), mz1Var.I0(), mz1Var.Z(), mz1Var.g(), mz1Var.Z(), mz1Var.O(), mz1Var.M0(), z, mz1Var.K0(), mz1Var.B(), mz1Var.C(), mz1Var.D(), mz1Var.E(), mz1Var.i0(), mz1Var.j0(), mz1Var.k0(), mz1Var.w0(), mz1Var.x0(), mz1Var.o0(), mz1Var.n0(), i, z2, i2, z3, mz1Var.A(), mz1Var.l(), mz1Var.m(), null);
        mz1Var.getClass();
    }
}
