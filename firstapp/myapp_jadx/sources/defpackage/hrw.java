package defpackage;

import com.esotericsoftware.spine.android.SpineView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.sportyherocompose.components.MultipliercomponentKt$Multipliercomponent$1$1", f = "Multipliercomponent.kt", l = {}, m = "invokeSuspend", v = 1)
public final class hrw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ytw<Boolean> c;
    public final /* synthetic */ ytw<SpineView> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hrw(String str, String str2, ytw<Boolean> ytwVar, ytw<SpineView> ytwVar2, v1b<? super hrw> v1bVar) {
        super(2, v1bVar);
        this.a = str;
        this.b = str2;
        this.c = ytwVar;
        this.d = ytwVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hrw(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hrw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str = this.a;
        ytw<Boolean> ytwVar = this.c;
        switch (str) {
            case "ROUND_PRE_START":
                trw.c(ytwVar, false);
                break;
            case "ROUND_WAITING":
                trw.c(ytwVar, false);
                break;
            case "ROUND_END_WAIT":
            case "ROUND_ONGOING":
                trw.c(ytwVar, false);
                break;
            default:
                trw.c(ytwVar, true);
                break;
        }
        SpineView value = this.d.getValue();
        if (value != null) {
            value.setBoundsProvider(new my90(this.b));
        }
        return Unit.a;
    }
}
