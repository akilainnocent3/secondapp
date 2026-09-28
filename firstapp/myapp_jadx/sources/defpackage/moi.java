package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.gp.tz.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: loaded from: classes6.dex */
public final class moi {

    @c0d(c = "com.sportybet.feature.footer.impl.presentation.components.FooterDateTimeDisplayKt$FooterDateTimeDisplay$1$1", f = "FooterDateTimeDisplay.kt", l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ ytw<Date> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ytw<Date> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0 && i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            while (w5b.e(v5bVar)) {
                this.c.setValue(Calendar.getInstance().getTime());
                b.a aVar = b.b;
                long jH = c.h(1, rgf.SECONDS);
                this.b = v5bVar;
                this.a = 1;
                if (hkd.c(jH, this) == y5bVar) {
                    return y5bVar;
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(1472010024);
        if (bVarI.q(i & 1, i != 0)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = TimeZone.getDefault().getDisplayName(false, 0);
                bVarI.r(objY);
            }
            String str = (String) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(Calendar.getInstance().getTime());
                bVarI.r(objY2);
            }
            ytw ytwVar = (ytw) objY2;
            Unit unit = Unit.a;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new a(ytwVar, null);
                bVarI.r(objY3);
            }
            xvf.e(bVarI, unit, (Function2) objY3);
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = new SimpleDateFormat("HH:mm:ss", Locale.US);
                bVarI.r(objY4);
            }
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) objY4;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
                bVarI.r(objY5);
            }
            SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) objY5;
            d dVarG = j.g(d.a.b, 1.0f);
            d160 d160VarA = b160.a(kw0.e, ht.a.j, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.d(cb40.a(R.string.main_footer__current_time, new Object[]{simpleDateFormat.format((Date) ytwVar.getValue()), tug.a("(", str, ")")}, bVarI), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new imf0(c68.a(R.color.text_type2_tertiary, bVarI), d2l.f(10), null, null, null, 0L, null, null, 0, d2l.f(12), null, null, 16646140), bVarI, 0, 0, 131070);
            lkf0.d(" ", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 6, 0, 262142);
            lkf0.d(cb40.a(R.string.main_footer__current_date, new Object[]{simpleDateFormat2.format((Date) ytwVar.getValue())}, bVarI), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new imf0(c68.a(R.color.text_type2_tertiary, bVarI), d2l.f(10), null, null, null, 0L, null, null, 0, d2l.f(12), null, null, 16646140), bVarI, 0, 0, 131070);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new loi();
        }
    }
}
