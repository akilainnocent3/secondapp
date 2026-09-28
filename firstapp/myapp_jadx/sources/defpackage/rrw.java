package defpackage;

import androidx.constraintlayout.motion.widget.MotionLayout;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.sportyherocompose.components.MultipliercomponentKt$ShootingStarAnimationOverlay$2$1", f = "Multipliercomponent.kt", l = {267}, m = "invokeSuspend", v = 1)
public final class rrw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public MotionLayout a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ String d;
    public final /* synthetic */ ytw<MotionLayout> e;
    public final /* synthetic */ ytw<MotionLayout> f;

    @c0d(c = "com.sportygames.sportyherocompose.components.MultipliercomponentKt$ShootingStarAnimationOverlay$2$1$1", f = "Multipliercomponent.kt", l = {248}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ MotionLayout b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MotionLayout motionLayout, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = motionLayout;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(1000L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ytw ytwVar = trw.a;
            MotionLayout motionLayout = this.b;
            ArrayList<androidx.constraintlayout.motion.widget.b.C0051b> definedTransitions = motionLayout.getDefinedTransitions();
            if (definedTransitions != null) {
                int size = definedTransitions.size();
                int i2 = 0;
                while (i2 < size) {
                    androidx.constraintlayout.motion.widget.b.C0051b c0051b = definedTransitions.get(i2);
                    i2++;
                    androidx.constraintlayout.motion.widget.b.C0051b c0051b2 = c0051b;
                    int i3 = c0051b2.a;
                    if (i3 == R.id.transition1) {
                        c0051b2.n = 4;
                    } else if (i3 == R.id.transition2) {
                        c0051b2.n = 3;
                    }
                }
            }
            motionLayout.setVisibility(0);
            motionLayout.bringToFront();
            motionLayout.setTransition(R.id.transition1);
            motionLayout.setProgress(0.0f);
            motionLayout.T();
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.sportyherocompose.components.MultipliercomponentKt$ShootingStarAnimationOverlay$2$1$2", f = "Multipliercomponent.kt", l = {258}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ MotionLayout b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MotionLayout motionLayout, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = motionLayout;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(10000L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            MotionLayout motionLayout = this.b;
            motionLayout.setVisibility(0);
            motionLayout.bringToFront();
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rrw(v1b v1bVar, ytw ytwVar, ytw ytwVar2, String str) {
        super(2, v1bVar);
        this.d = str;
        this.e = ytwVar;
        this.f = ytwVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rrw rrwVar = new rrw(v1bVar, this.e, this.f, this.d);
        rrwVar.c = obj;
        return rrwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rrw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        MotionLayout value;
        v5b v5bVar = (v5b) this.c;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            ytw ytwVar = trw.a;
            MotionLayout value2 = this.e.getValue();
            if (value2 == null) {
                return Unit.a;
            }
            value = this.f.getValue();
            if (value == null) {
                return Unit.a;
            }
            String str = this.d;
            if (str.equals("ROUND_WAITING")) {
                value2.setVisibility(8);
                value.setVisibility(8);
                value2.setProgress(0.0f);
                value.setProgress(0.0f);
                return Unit.a;
            }
            if (!str.equals("ROUND_ONGOING")) {
                return Unit.a;
            }
            value.setVisibility(8);
            ArrayList<androidx.constraintlayout.motion.widget.b.C0051b> definedTransitions = value.getDefinedTransitions();
            if (definedTransitions != null) {
                int size = definedTransitions.size();
                int i2 = 0;
                while (i2 < size) {
                    androidx.constraintlayout.motion.widget.b.C0051b c0051b = definedTransitions.get(i2);
                    i2++;
                    c0051b.n = 0;
                }
            }
            ej5.c(v5bVar, null, null, new a(value2, null), 3);
            ej5.c(v5bVar, null, null, new b(value, null), 3);
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            value = this.a;
            uj50.b(obj);
        }
        while (w5b.e(v5bVar)) {
            value.setTransition(R.id.transition1);
            value.setProgress(0.0f);
            value.T();
            this.c = v5bVar;
            this.a = value;
            this.b = 1;
            if (hkd.b(20000L, this) == y5bVar) {
                return y5bVar;
            }
        }
        return Unit.a;
    }
}
