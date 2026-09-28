package defpackage;

import com.sporty.android.core.model.primaryphone.GetReviewedPrimaryPhoneResult;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.primaryphone.updatedsuccessfully.PrimaryPhoneUpdatedSuccessfullyViewModel$fetchReviewedPrimaryPhone$1", f = "PrimaryPhoneUpdatedSuccessfullyViewModel.kt", l = {38}, m = "invokeSuspend", v = 2)
public final class av20 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ cv20 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ cv20 a;

        public a(cv20 cv20Var) {
            this.a = cv20Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            String str;
            Object value2;
            lk50 lk50Var = (lk50) obj;
            wwd0 wwd0Var = this.a.b;
            if (lk50Var instanceof lk50.c) {
                GetReviewedPrimaryPhoneResult getReviewedPrimaryPhoneResult = (GetReviewedPrimaryPhoneResult) ((lk50.c) lk50Var).a;
                String validTime = getReviewedPrimaryPhoneResult.getValidTime();
                if (validTime != null) {
                    try {
                        str = new SimpleDateFormat("dd-MM-yyyy HH:mm", Locale.getDefault()).format(ovo.g(validTime));
                        str.getClass();
                    } catch (Exception unused) {
                        str = "?";
                    }
                } else {
                    str = "";
                }
                String str2 = str;
                do {
                    value2 = wwd0Var.getValue();
                } while (!wwd0Var.g(value2, yu20.a((yu20) value2, getReviewedPrimaryPhoneResult.getCurrentPhone(), getReviewedPrimaryPhoneResult.getNewPhone(), str2, false, 8)));
            } else if (lk50Var instanceof lk50.a) {
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, yu20.a((yu20) value, null, null, null, true, 7)));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av20(cv20 cv20Var, v1b<? super av20> v1bVar) {
        super(2, v1bVar);
        this.b = cv20Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new av20(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((av20) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            cv20 cv20Var = this.b;
            yzh yzhVarB = bm50.b(cv20Var.a.S(), vch0.b);
            a aVar = new a(cv20Var);
            this.a = 1;
            if (yzhVarB.collect(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
