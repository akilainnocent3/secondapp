package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Luzx;", "Lj8i0;", "a", "b", "sportybook"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class uzx extends j8i0 {
    public final txb a;
    public final lkh0 b;
    public final cmd c;
    public final iym d;
    public final y8j e;
    public final lq1 f;
    public final wwd0 i;
    public final v340 v;
    public final b390 w;
    public final t340 y;

    public static final class a {
        public final String a;
        public final boolean b;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            String str = this.a;
            return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return tzx.a("NotesOnBetUiState(noteText=", this.a, ", showNewBadge=", ")", this.b);
        }
    }

    public static abstract class b {
        public final String a;

        public static final class a extends b {
            public final String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(str);
                str.getClass();
                this.b = str;
            }

            @Override // uzx.b
            public final String a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.g(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return tug.a("DismissDialog(orderId=", this.b, ")");
            }
        }

        /* JADX INFO: renamed from: uzx$b$b, reason: collision with other inner class name */
        public static final class C1193b extends b {
            public final String b;
            public final int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1193b(String str, int i) {
                super(str);
                str.getClass();
                this.b = str;
                this.c = i;
            }

            @Override // uzx.b
            public final String a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1193b)) {
                    return false;
                }
                C1193b c1193b = (C1193b) obj;
                return Intrinsics.g(this.b, c1193b.b) && this.c == c1193b.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return d830.a(this.c, "ShowSnackbar(orderId=", this.b, ", messageRes=", ")");
            }
        }

        public b(String str) {
            this.a = str;
        }

        public String a() {
            return this.a;
        }
    }

    @c0d(c = "com.sporty.android.book.presentation.notesonbet.NoteOnBetViewModel$_showNewBadgeState$1", f = "NoteOnBetViewModel.kt", l = {180, 55}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<myh<? super Boolean>, v1b<? super Unit>, Object> {
        public BOConfigParam a;
        public int b;
        public /* synthetic */ Object c;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = uzx.this.new c(v1bVar);
            cVar.c = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super Boolean> myhVar, v1b<? super Unit> v1bVar) {
            return ((c) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0063  */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x0123, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L84;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 297
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: uzx.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public uzx(txb txbVar, lkh0 lkh0Var, cmd cmdVar, iym iymVar, y8j y8jVar, lq1 lq1Var) {
        iymVar.getClass();
        y8jVar.getClass();
        lq1Var.getClass();
        this.a = txbVar;
        this.b = lkh0Var;
        this.c = cmdVar;
        this.d = iymVar;
        this.e = y8jVar;
        this.f = lq1Var;
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.i = xwd0.a(o2gVar);
        this.v = e1i.e(new or60(new c(null)), o8i0.d(this), new mwd0(5000L, Long.MAX_VALUE), Boolean.FALSE);
        b390 b390VarB = d390.b(0, 0, null, 7);
        this.w = b390VarB;
        this.y = e1i.a(b390VarB);
    }

    public final void x1(String str, UIState<String> uIState) {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.i;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, kpu.i((Map) value, new Pair(str, uIState))));
    }
}
