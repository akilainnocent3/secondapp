package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.presentation.notesonbet.NoteOnBetItemKt$NoteOnBetItem$9$1", f = "NoteOnBetItem.kt", l = {99}, m = "invokeSuspend", v = 2)
public final class qzx extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ uzx b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ ytw<Boolean> e;

    public static final class a<T> implements myh {
        public final /* synthetic */ Context a;
        public final /* synthetic */ ytw<Boolean> b;

        public a(Context context, ytw<Boolean> ytwVar) {
            this.a = context;
            this.b = ytwVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            uzx.b bVar = (uzx.b) obj;
            if (bVar instanceof uzx.b.C1193b) {
                Context context = this.a;
                context.getClass();
                String strB = sn5.b(context, ((uzx.b.C1193b) bVar).c, new Object[0]);
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.snackbar_toast_view, (ViewGroup) null);
                ((TextView) viewInflate.findViewById(R.id.toast_message)).setText(strB);
                Toast toast = new Toast(context);
                toast.setView(viewInflate);
                toast.setDuration(1);
                toast.setGravity(87, 0, 0);
                toast.show();
            } else {
                if (!(bVar instanceof uzx.b.a)) {
                    uhc.a();
                    return null;
                }
                this.b.setValue(Boolean.FALSE);
            }
            return Unit.a;
        }
    }

    public static final class b implements lyh<uzx.b> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ String b;

        @c0d(c = "com.sporty.android.book.presentation.notesonbet.NoteOnBetItemKt$NoteOnBetItem$9$1$invokeSuspend$$inlined$filter$1", f = "NoteOnBetItem.kt", l = {109}, m = "collect", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        /* JADX INFO: renamed from: qzx$b$b, reason: collision with other inner class name */
        public static final class C1029b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ String b;

            /* JADX INFO: renamed from: qzx$b$b$a */
            @c0d(c = "com.sporty.android.book.presentation.notesonbet.NoteOnBetItemKt$NoteOnBetItem$9$1$invokeSuspend$$inlined$filter$1$2", f = "NoteOnBetItem.kt", l = {50}, m = "emit", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C1029b.this.emit(null, this);
                }
            }

            public C1029b(myh myhVar, String str) {
                this.a = myhVar;
                this.b = str;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    if (Intrinsics.g(((uzx.b) obj).a(), this.b)) {
                        aVar.b = 1;
                        if (this.a.emit(obj, aVar) == y5bVar) {
                            return y5bVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public b(t340 t340Var, String str) {
            this.a = t340Var;
            this.b = str;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super uzx.b> myhVar, v1b v1bVar) {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj);
                C1029b c1029b = new C1029b(myhVar, this.b);
                aVar.b = 1;
                if (this.a.collect(c1029b, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qzx(uzx uzxVar, String str, Context context, ytw<Boolean> ytwVar, v1b<? super qzx> v1bVar) {
        super(2, v1bVar);
        this.b = uzxVar;
        this.c = str;
        this.d = context;
        this.e = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qzx(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qzx) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            b bVar = new b(this.b.y, this.c);
            a aVar = new a(this.d, this.e);
            this.a = 1;
            if (bVar.collect(aVar, this) == y5bVar) {
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
