package com.sportybet.feature.luckynumber.placebet.presentation;

import defpackage.a1s;
import defpackage.ae80;
import defpackage.hwr;
import defpackage.om2;
import defpackage.php;
import defpackage.tag;
import defpackage.tmm;
import defpackage.ttr;
import defpackage.wag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@ae80
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/sportybet/feature/luckynumber/placebet/presentation/HowToPlayPresentation;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "DEFAULT", "MAIN_DRAW_DIALOG", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum HowToPlayPresentation {
    DEFAULT,
    MAIN_DRAW_DIALOG;

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final ttr<php<Object>> $cachedSerializer$delegate = hwr.a(a1s.b, new tmm());

    /* JADX INFO: renamed from: com.sportybet.feature.luckynumber.placebet.presentation.HowToPlayPresentation$a, reason: from kotlin metadata */
    public static final class Companion {
        public final php<HowToPlayPresentation> serializer() {
            return (php) HowToPlayPresentation.$cachedSerializer$delegate.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final php _init_$_anonymous_() {
        HowToPlayPresentation[] howToPlayPresentationArrValues = values();
        howToPlayPresentationArrValues.getClass();
        return new wag("com.sportybet.feature.luckynumber.placebet.presentation.HowToPlayPresentation", howToPlayPresentationArrValues);
    }

    public static tag<HowToPlayPresentation> getEntries() {
        return $ENTRIES;
    }
}
