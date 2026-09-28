package defpackage;

import com.sportybet.plugin.realsports.live.data.LiveLoadingData;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wss implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ wss(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new LiveLoadingData(mvs.TYPE_LOADING, szs.a);
            default:
                return new mcy("com.sportybet.feature.playtimecontrol.navigation.PlayTimeControlNavigation.Main", fn10.INSTANCE, new Annotation[0]);
        }
    }
}
