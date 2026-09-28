package defpackage;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.e;
import com.bumptech.glide.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a6j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a6j(int i, Object obj, Object obj2) {
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
                e eVar = (e) obj2;
                a.b(eVar).e(eVar).o(Integer.valueOf(R.drawable.fh_multiplier_image)).M((AppCompatImageView) obj);
                break;
            case 1:
                ((Function1) obj2).invoke(new ot70.c(((fu70) obj).a));
                break;
            default:
                Function0 function0 = (Function0) obj2;
                osw oswVar = (osw) obj;
                int iD = oswVar.D();
                if (iD == 0) {
                    oswVar.k(1);
                } else if (iD == 1 || iD == 2) {
                    oswVar.k(3);
                } else if (iD == 3 || iD == 4) {
                    oswVar.k(5);
                } else {
                    function0.invoke();
                }
                break;
        }
        return Unit.a;
    }
}
