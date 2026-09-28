package defpackage;

import com.sportygames.newcms.b;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bp5 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ bp5(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new b(0);
            case 1:
                cin cinVar = new cin();
                cinVar.a(jq40.a(lfx.a.class), new kfx(0));
                return cinVar.b();
            default:
                return null;
        }
    }
}
