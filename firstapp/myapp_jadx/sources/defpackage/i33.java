package defpackage;

import android.widget.SeekBar;
import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class i33 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ BetSlipFooter b;

    @c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter$initSeekBar$1$1$onProgressChanged$1", f = "BetSlipFooter.kt", l = {2097}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ BetSlipFooter b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BetSlipFooter betSlipFooter, int i, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = betSlipFooter;
            this.c = i;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
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
                m2l dataStore = this.b.getDataStore();
                Integer num = new Integer(this.c);
                this.a = 1;
                if (dataStore.a.putInt("slider_progress_percentage", num, this) == y5bVar) {
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

    public i33(int i, BetSlipFooter betSlipFooter) {
        this.a = i;
        this.b = betSlipFooter;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            int i2 = i + this.a;
            BetSlipFooter betSlipFooter = this.b;
            to3 to3Var = betSlipFooter.H;
            if (to3Var != null) {
                to3Var.d(i2);
            }
            las lasVar = betSlipFooter.I;
            if (lasVar != null) {
                ej5.c(lasVar, null, null, new a(betSlipFooter, i2, null), 3);
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.b.V = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
