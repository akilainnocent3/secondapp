package defpackage;

import j$.time.LocalDate;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.playtimecontrol.edit.viewmodel.EditTimeOutViewModel$buildUI$1", f = "EditTimeOutViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class quf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ suf a;
    public final /* synthetic */ cr10 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public quf(suf sufVar, cr10 cr10Var, String str, String str2, v1b<? super quf> v1bVar) {
        super(2, v1bVar);
        this.a = sufVar;
        this.b = cr10Var;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new quf(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((quf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        i2z i2zVar;
        String str;
        uf00<i2z> uf00Var;
        i2z next;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        suf sufVar = this.a;
        wwd0 wwd0Var = sufVar.a;
        cr10 cr10Var = this.b;
        cr10Var.getClass();
        String str2 = this.c;
        if (str2 == null || StringsKt.U(str2) || (str = this.d) == null || StringsKt.U(str)) {
            sufVar.e = new lsf(cr10Var, null);
            i2zVar = null;
        } else {
            DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            long jBetween = ChronoUnit.DAYS.between(LocalDate.parse(str2, dateTimeFormatterOfPattern), LocalDate.parse(str, dateTimeFormatterOfPattern));
            int iOrdinal = cr10Var.ordinal();
            if (iOrdinal == 0) {
                uf00Var = msf.b;
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return null;
                }
                uf00Var = msf.a;
            }
            Iterator<i2z> it = uf00Var.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.c != jBetween);
            i2zVar = next;
            sufVar.e = new lsf(cr10Var, i2zVar);
        }
        ksf.b bVar = new ksf.b(new lsf(cr10Var, i2zVar));
        wwd0Var.getClass();
        wwd0Var.k(null, bVar);
        return Unit.a;
    }
}
