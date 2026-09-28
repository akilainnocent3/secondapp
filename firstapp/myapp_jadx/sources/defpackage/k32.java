package defpackage;

import android.net.Uri;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.notificationcenter.viewmodel.BaseNCViewModel$ncEntryList$1$1", f = "BaseNCViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k32 extends tje0 implements Function2<h3x, v1b<? super j3x>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ n32 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k32(n32 n32Var, v1b<? super k32> v1bVar) {
        super(2, v1bVar);
        this.b = n32Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        k32 k32Var = new k32(this.b, v1bVar);
        k32Var.a = obj;
        return k32Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(h3x h3xVar, v1b<? super j3x> v1bVar) {
        return ((k32) create(h3xVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        n2x aVar;
        Object bVar2;
        h3x h3xVar = (h3x) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        int length = h3xVar.g.length();
        n32 n32Var = this.b;
        if (length > 0) {
            n32Var.d.a(h3xVar.g);
        }
        int i = h3xVar.a;
        String str = h3xVar.e;
        String str2 = h3xVar.f;
        String str3 = h3xVar.d;
        try {
            zi50.a aVar2 = zi50.b;
            Date dateG = ovo.g(str3);
            dateG.getClass();
            Locale locale = Locale.getDefault();
            locale.getClass();
            bVar = bwf0.l(dateG, "dd/MM/yyyy HH:mm", locale, 2, 0);
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        String str4 = (String) bVar;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = h3xVar.g;
        String str6 = h3xVar.h;
        String str7 = h3xVar.i;
        if (str6.length() == 0 || str7.length() == 0) {
            aVar = n2x.c.a;
        } else {
            try {
                bVar2 = Uri.parse(str7);
            } catch (Throwable th2) {
                zi50.a aVar4 = zi50.b;
                bVar2 = new zi50.b(th2);
            }
            if (bVar2 instanceof zi50.b) {
                bVar2 = null;
            }
            Uri uri = (Uri) bVar2;
            aVar = uri != null ? n32Var.c.b(true, uri) : false ? new n2x.a(str6, str7) : new n2x.b(str7);
        }
        return new j3x(i, str, str2, str4, str5, aVar, false);
    }
}
