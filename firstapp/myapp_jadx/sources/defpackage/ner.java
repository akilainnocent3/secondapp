package defpackage;

import android.os.SystemClock;
import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.e;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LNStreamIconStateHolderKt$rememberLNStreamIconState$1$1", f = "LNStreamIconStateHolder.kt", l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class ner extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ytw<mer> b;
    public final /* synthetic */ qcn<jer> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ner(ytw<mer> ytwVar, qcn<jer> qcnVar, v1b<? super ner> v1bVar) {
        super(2, v1bVar);
        this.b = ytwVar;
        this.c = qcnVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ner(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ner) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        Long lValueOf;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0 && i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        do {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ytw<mer> ytwVar = this.b;
            qcn<jer> qcnVar = this.c;
            ytwVar.setValue(per.a(jElapsedRealtime, qcnVar));
            ArrayList arrayList = new ArrayList();
            Iterator<jer> it = qcnVar.iterator();
            while (it.hasNext()) {
                e eVar = it.next().a;
                long j = eVar.a;
                long j2 = eVar.b;
                if (j > j2) {
                    lValueOf = null;
                } else if (jElapsedRealtime < j) {
                    lValueOf = Long.valueOf(j);
                } else if (jElapsedRealtime > j2 || j > jElapsedRealtime || j2 == Long.MAX_VALUE) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(j2 + 1);
                }
                if (lValueOf != null) {
                    arrayList.add(lValueOf);
                }
            }
            Long l = (Long) CollectionsKt.f0(arrayList);
            if (l == null) {
                return Unit.a;
            }
            jLongValue = l.longValue() - jElapsedRealtime;
            if (jLongValue < 0) {
                jLongValue = 0;
            }
            this.a = 1;
        } while (hkd.b(jLongValue, this) != y5bVar);
        return y5bVar;
    }
}
