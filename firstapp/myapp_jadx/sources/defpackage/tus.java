package defpackage;

import android.content.Context;
import com.sportybet.plugin.realsports.prematch.widget.LiveTogglesContainer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tus implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tus(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return LiveTogglesContainer.b((Context) obj2, (LiveTogglesContainer) obj);
            default:
                return new qea0.a((rea0) obj2, (String) obj);
        }
    }
}
