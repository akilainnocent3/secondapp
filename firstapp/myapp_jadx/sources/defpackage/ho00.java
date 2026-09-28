package defpackage;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ho00 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ho00(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new mcy("com.sportybet.android.social.presentation.personal.PersonalSocialRoute.PersonalScreen", go00.b.INSTANCE, new Annotation[0]);
            default:
                HashMap map = new HashMap();
                map.putAll(jl40.e.c);
                map.putAll(jl40.g);
                return map;
        }
    }
}
