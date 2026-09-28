package defpackage;

import android.graphics.Bitmap;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o190 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o190(h190 h190Var, d dVar, Function0 function0, int i) {
        this.b = h190Var;
        this.c = dVar;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                p190.c((h190) obj5, (d) obj4, (Function0) obj3, (a) obj, qj40.a(49));
                break;
            default:
                String str = (String) obj5;
                String str2 = (String) obj4;
                Bitmap bitmap = (Bitmap) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    hxg0.b(str, str2, bitmap, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ o190(String str, String str2, Bitmap bitmap) {
        this.b = str;
        this.c = str2;
        this.d = bitmap;
    }
}
