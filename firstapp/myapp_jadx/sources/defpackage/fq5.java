package defpackage;

import android.content.Context;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq5;", "Lj8i0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class fq5 extends j8i0 {
    public final to5 a = new to5();
    public final mcb0 b = new mcb0();
    public final ssw<LoadingState<List<File>>> c;

    @c0d(c = "com.sportygames.cms.viewmodel.CMSViewModel$getCMSPages$1", f = "CMSViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ ArrayList<String> b;
        public final /* synthetic */ Context c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList<String> arrayList, Context context, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = arrayList;
            this.c = context;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return fq5.this.new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            final fq5 fq5Var = fq5.this;
            fq5Var.c.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
            fq5Var.a.a(this.b, new Function1() { // from class: eq5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    fq5Var.c.j(new LoadingState<>(Status.SUCCESS, (ArrayList) obj2, null, null, null, 16, null));
                    return Unit.a;
                }
            }, this.c);
            return Unit.a;
        }
    }

    public fq5() {
        new ssw();
        this.c = new ssw<>();
    }

    public final void x1(Context context, ArrayList<String> arrayList, String str) {
        context.getClass();
        arrayList.getClass();
        str.getClass();
        to5 to5Var = this.a;
        to5Var.getClass();
        to5Var.b = str;
        ej5.c(o8i0.d(this), null, null, new a(arrayList, context, null), 3);
    }

    public final Object y1(Context context, String str, String str2, tje0 tje0Var) {
        mcb0 mcb0Var = this.b;
        mcb0Var.getClass();
        pfd pfdVar = fse.a;
        return ej5.d(odd.b, new lcb0(str2, str, mcb0Var, context, null), tje0Var);
    }
}
