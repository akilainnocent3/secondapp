package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class fjh0 {
    public final /* synthetic */ djh0 a;
    public final /* synthetic */ uqm b;

    public fjh0(djh0 djh0Var, uqm uqmVar) {
        this.a = djh0Var;
        this.b = uqmVar;
    }

    public final String a() {
        String languageCode = this.b.getLanguageCode();
        languageCode.getClass();
        return languageCode;
    }

    public final int b(String str) {
        str.getClass();
        return this.a.e.f(str);
    }

    public final ArrayList c() {
        return this.a.e.g();
    }

    public final void d(int i, final String str) {
        str.getClass();
        final djh0 djh0Var = this.a;
        djh0Var.e.h(i, str, new Function1() { // from class: ejh0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                djh0 djh0Var2 = djh0Var;
                ArrayList arrayList = djh0Var2.m;
                String str2 = str;
                str2.getClass();
                vfh0.a(str2, (String) obj, arrayList);
                iqs iqsVar = djh0Var2.n;
                if (iqsVar != null) {
                    LivePageActivity livePageActivity = iqsVar.a;
                    int i2 = LivePageActivity.b0;
                    RecyclerView recyclerView = livePageActivity.z1().e;
                    final djh0 djh0Var3 = iqsVar.b;
                    recyclerView.post(new Runnable() { // from class: hqs
                        @Override // java.lang.Runnable
                        public final void run() {
                            djh0 djh0Var4 = djh0Var3;
                            djh0Var4.c();
                            djh0Var4.h();
                        }
                    });
                }
                return Unit.a;
            }
        });
    }
}
