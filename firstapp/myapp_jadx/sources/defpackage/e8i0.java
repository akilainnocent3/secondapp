package defpackage;

import android.widget.TextView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.extensions.ViewKt$setTextValueDebounced$newJob$1", f = "View.kt", l = {262}, m = "invokeSuspend", v = 2)
public final class e8i0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ CharSequence c;
    public final /* synthetic */ Map<String, c9p> d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8i0(TextView textView, CharSequence charSequence, Map map, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.b = textView;
        this.c = charSequence;
        this.d = map;
        this.e = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new e8i0(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((e8i0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        TextView textView = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        String str = this.e;
        Map<String, c9p> map = this.d;
        try {
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(200L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            if (textView.isAttachedToWindow()) {
                textView.setText(this.c);
            }
            if (map != null) {
                map.remove(str);
            }
            return Unit.a;
        } catch (Throwable th) {
            if (map != null) {
                map.remove(str);
            }
            throw th;
        }
    }
}
