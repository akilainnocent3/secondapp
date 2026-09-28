package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.core.model.service.CountryCodeName;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class quv implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ haj i;

    public /* synthetic */ quv(Object obj, Object obj2, Object obj3, Function0 function0, haj hajVar, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = function0;
        this.i = hajVar;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        haj hajVar = this.i;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                xuv.a((lk40) obj5, (wtt) obj4, (vxj) obj3, (ztt) this.f, (Function1) hajVar, (a) obj, qj40.a(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                int iA = qj40.a(i2 | 1);
                Function0 function0 = this.f;
                sj00.b((tx4) obj5, (zpz) obj4, (CountryCodeName) obj3, function0, (Function0) hajVar, (a) obj, iA);
                break;
        }
        return Unit.a;
    }
}
