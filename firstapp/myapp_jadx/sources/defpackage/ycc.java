package defpackage;

import com.sportybet.android.social.domain.CustomCodes;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$displayEditCode$1", f = "CustomCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ycc extends tje0 implements Function2<String, v1b<? super lyh<? extends f8c.b>>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ bdc b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycc(bdc bdcVar, String str, int i, v1b<? super ycc> v1bVar) {
        super(2, v1bVar);
        this.b = bdcVar;
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ycc yccVar = new ycc(this.b, this.c, this.d, v1bVar);
        yccVar.a = obj;
        return yccVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, v1b<? super lyh<? extends f8c.b>> v1bVar) {
        return ((ycc) create(str, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String strA = i8c.a("", ((CustomCodes) this.b.w.a.getValue()).a, str);
        String str2 = this.c;
        return new gzh(new f8c.b(this.d, strA, StringsKt.k0(str2, str, str2), false, false));
    }
}
