package com.sporty.android.core.model.antest;

import androidx.recyclerview.widget.r;
import com.sporty.android.core.model.service.CountryCodeName;
import com.twilio.voice.EventKeys;
import defpackage.kpu;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/core/model/antest/ANStakeManager;", "", "<init>", "()V", "ANDROID_DEFAULT_STAKE_NG", "", "ANDROID_DEFAULT_STAKE_GH", "ANDROID_DEFAULT_STAKE_TZ", "ANDROID_DEFAULT_STAKE_ZM", "ANDROID_DEFAULT_STAKE_BR", "VARIANT_A", "VARIANT_B", "VARIANT_C", "VARIANT_D", "anStakeMap", "", "Lkotlin/Pair;", "Ljava/math/BigDecimal;", "getANStakeValue", EventKeys.ERROR_CODE, "variant", "getCampaignCodeValue", "Lcom/sporty/android/core/model/service/CountryCodeName;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ANStakeManager {
    public static final ANStakeManager INSTANCE = new ANStakeManager();
    private static final String ANDROID_DEFAULT_STAKE_NG = "android_default_stake_ng";
    private static final String VARIANT_A = "A";
    private static final String VARIANT_B = "B";
    private static final String VARIANT_C = "C";
    private static final String VARIANT_D = "D";
    private static final String ANDROID_DEFAULT_STAKE_GH = "android_default_stake_gh";
    private static final String ANDROID_DEFAULT_STAKE_TZ = "android_default_stake_tz";
    private static final String ANDROID_DEFAULT_STAKE_ZM = "android_default_stake_zm";
    private static final String ANDROID_DEFAULT_STAKE_BR = "android_default_stake_br";
    private static final Map<Pair<String, String>, BigDecimal> anStakeMap = kpu.f(new Pair(new Pair(ANDROID_DEFAULT_STAKE_NG, VARIANT_A), new BigDecimal(100)), new Pair(new Pair(ANDROID_DEFAULT_STAKE_NG, VARIANT_B), new BigDecimal(r.d.DEFAULT_DRAG_ANIMATION_DURATION)), new Pair(new Pair(ANDROID_DEFAULT_STAKE_NG, VARIANT_C), new BigDecimal(300)), new Pair(new Pair(ANDROID_DEFAULT_STAKE_NG, VARIANT_D), new BigDecimal(400)), new Pair(new Pair(ANDROID_DEFAULT_STAKE_GH, VARIANT_A), new BigDecimal(1)), new Pair(new Pair(ANDROID_DEFAULT_STAKE_GH, VARIANT_B), new BigDecimal(2)), new Pair(new Pair(ANDROID_DEFAULT_STAKE_GH, VARIANT_C), new BigDecimal(3)), new Pair(new Pair(ANDROID_DEFAULT_STAKE_GH, VARIANT_D), new BigDecimal(4)), new Pair(new Pair(ANDROID_DEFAULT_STAKE_TZ, VARIANT_A), new BigDecimal(r.d.DEFAULT_DRAG_ANIMATION_DURATION)), new Pair(new Pair(ANDROID_DEFAULT_STAKE_TZ, VARIANT_B), new BigDecimal(300)), new Pair(new Pair(ANDROID_DEFAULT_STAKE_TZ, VARIANT_C), new BigDecimal(400)), new Pair(new Pair(ANDROID_DEFAULT_STAKE_TZ, VARIANT_D), new BigDecimal(500)), new Pair(new Pair(ANDROID_DEFAULT_STAKE_ZM, VARIANT_A), new BigDecimal(2)), new Pair(new Pair(ANDROID_DEFAULT_STAKE_ZM, VARIANT_B), new BigDecimal(3)), new Pair(new Pair(ANDROID_DEFAULT_STAKE_ZM, VARIANT_C), new BigDecimal(4)), new Pair(new Pair(ANDROID_DEFAULT_STAKE_ZM, VARIANT_D), new BigDecimal(5)), new Pair(new Pair(ANDROID_DEFAULT_STAKE_BR, VARIANT_A), new BigDecimal(65)), new Pair(new Pair(ANDROID_DEFAULT_STAKE_BR, VARIANT_B), new BigDecimal(75)), new Pair(new Pair(ANDROID_DEFAULT_STAKE_BR, VARIANT_C), new BigDecimal(85)), new Pair(new Pair(ANDROID_DEFAULT_STAKE_BR, VARIANT_D), new BigDecimal(95)));

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            try {
                iArr[CountryCodeName.NIGERIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CountryCodeName.GHANA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CountryCodeName.TANZANIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CountryCodeName.ZAMBIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CountryCodeName.BRAZIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ANStakeManager() {
    }

    public final BigDecimal getANStakeValue(String code, String variant) {
        code.getClass();
        variant.getClass();
        return anStakeMap.get(new Pair(code, variant));
    }

    public final String getCampaignCodeValue(CountryCodeName code) {
        code.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[code.ordinal()];
        if (i == 1) {
            return ANDROID_DEFAULT_STAKE_NG;
        }
        if (i == 2) {
            return ANDROID_DEFAULT_STAKE_GH;
        }
        if (i != 3) {
            return i != 4 ? ANDROID_DEFAULT_STAKE_BR : ANDROID_DEFAULT_STAKE_ZM;
        }
        return ANDROID_DEFAULT_STAKE_TZ;
    }
}
