package defpackage;

import android.view.View;
import com.google.protobuf.Reader;
import com.sportybet.android.widget.BetSlipHintView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t43 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t43(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Function0<Unit> function0 = ((BetSlipHintView) obj).F;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                final jgd0 jgd0Var = (jgd0) obj;
                Object tag = view.getTag();
                if (!(tag instanceof Integer)) {
                    tag = null;
                }
                if (((Integer) tag) != null) {
                    jgd0Var.w.post(new Runnable() { // from class: l98
                        @Override // java.lang.Runnable
                        public final void run() {
                            jgd0 jgd0Var2 = jgd0Var;
                            jgd0Var2.b.setMaxLines(Reader.READ_DONE);
                            jgd0Var2.w.setVisibility(8);
                        }
                    });
                }
                break;
        }
    }
}
