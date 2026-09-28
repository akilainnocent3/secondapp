package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xrs implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xrs(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jLongValue;
        long jLongValue2;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((zrs.a) obj2).invoke(Boolean.valueOf(!((nss.a) obj).a));
                break;
            default:
                View view2 = (View) obj2;
                Function1 function1 = (Function1) obj;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (view2.getTag(1123460103) != null) {
                    Object tag = view2.getTag(1123460103);
                    tag.getClass();
                    jLongValue = ((Long) tag).longValue();
                } else {
                    jLongValue = 0;
                }
                long j = jCurrentTimeMillis - jLongValue;
                if (view2.getTag(1123461123) != null) {
                    Object tag2 = view2.getTag(1123461123);
                    tag2.getClass();
                    jLongValue2 = ((Long) tag2).longValue();
                } else {
                    jLongValue2 = -1;
                }
                boolean z = j >= jLongValue2;
                view2.setTag(1123460103, Long.valueOf(jCurrentTimeMillis));
                if (z) {
                    view.getClass();
                    function1.invoke(view);
                }
                break;
        }
    }
}
