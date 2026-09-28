package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class z640 extends RecyclerView.d0 {
    public boolean A;
    public boolean B;
    public final y8j a;
    public final jjd0 b;
    public final r540 c;
    public final s540 d;
    public final t540 e;
    public final Function1<z640, Unit> f;
    public final pah i;
    public final Function0<Unit> v;
    public final bp3 w;
    public final rah y;
    public final Context z;

    /* JADX WARN: Illegal instructions before constructor call */
    public z640(y8j y8jVar, final jjd0 jjd0Var, r540 r540Var, s540 s540Var, t540 t540Var, r440 r440Var, pah pahVar, c4r c4rVar, bp3 bp3Var, rah rahVar) {
        y8jVar.getClass();
        r440Var.getClass();
        c4rVar.getClass();
        ConstraintLayout constraintLayout = jjd0Var.a;
        super(constraintLayout);
        this.a = y8jVar;
        this.b = jjd0Var;
        this.c = r540Var;
        this.d = s540Var;
        this.e = t540Var;
        this.f = r440Var;
        this.i = pahVar;
        this.v = c4rVar;
        this.w = bp3Var;
        this.y = rahVar;
        Context context = constraintLayout.getContext();
        this.z = context;
        jjd0Var.d.setOnClickListener(new View.OnClickListener() { // from class: u640
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z640 z640Var = this.a;
                Integer numA = z640.a(z640Var);
                if (numA != null) {
                    z640Var.e.invoke(numA);
                }
            }
        });
        jjd0Var.b.setOnClickListener(new View.OnClickListener() { // from class: v640
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z640 z640Var = this.a;
                Integer numA = z640.a(z640Var);
                if (numA != null) {
                    z640Var.w.invoke(numA);
                }
            }
        });
        jjd0Var.R.setOnClickListener(new oem(this, 1));
        final aq40 aq40Var = new aq40();
        final aq40 aq40Var2 = new aq40();
        final aq40 aq40Var3 = new aq40();
        final yp40 yp40Var = new yp40();
        final yp40 yp40Var2 = new yp40();
        final GestureDetector gestureDetector = new GestureDetector(context, new y640(this, yp40Var));
        jjd0Var.V.setOnTouchListener(new View.OnTouchListener() { // from class: w640
            /* JADX WARN: Code duplicated, block: B:21:0x0059  */
            /* JADX WARN: Code duplicated, block: B:23:0x005d  */
            /* JADX WARN: Code duplicated, block: B:25:0x006c  */
            /* JADX WARN: Code duplicated, block: B:26:0x0075  */
            /* JADX WARN: Code duplicated, block: B:28:0x007f  */
            /* JADX WARN: Code duplicated, block: B:29:0x0083  */
            /* JADX WARN: Code duplicated, block: B:31:0x008e  */
            /* JADX WARN: Code duplicated, block: B:33:0x0094  */
            /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
            /* JADX WARN: Code duplicated, block: B:37:0x00bc  */
            /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
            /* JADX WARN: Code duplicated, block: B:42:0x00e3  */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                float f;
                float f2;
                Integer numA;
                ConstraintLayout constraintLayout2 = jjd0Var.V;
                z640 z640Var = this;
                jjd0 jjd0Var2 = z640Var.b;
                int action = motionEvent.getAction();
                aq40 aq40Var4 = aq40Var;
                aq40 aq40Var5 = aq40Var2;
                yp40 yp40Var3 = yp40Var;
                if (action != 0) {
                    yp40 yp40Var4 = yp40Var2;
                    if (action == 1) {
                        if (yp40Var3.a) {
                            float width = constraintLayout2.getWidth();
                            f = 0.25f * width;
                            f2 = width * 0.5f;
                            if (!z640Var.B) {
                                z640Var.v.invoke();
                                z640Var.c();
                            } else if (constraintLayout2.getTranslationX() > aq40Var5.a) {
                                z640Var.c();
                            } else if (constraintLayout2.getTranslationX() < (-f2)) {
                                numA = z640.a(z640Var);
                                if (numA != null) {
                                    z640Var.i.invoke(numA);
                                }
                                jjd0Var2.V.animate().translationX(-jjd0Var2.V.getWidth()).setDuration(200L).start();
                            } else if (constraintLayout2.getTranslationX() < (-f)) {
                                jjd0Var2.V.animate().translationX(-bqe.b(64.0f, z640Var.z)).setDuration(200L).start();
                            } else {
                                z640Var.c();
                            }
                            yp40Var4.a = false;
                        }
                        if (motionEvent.getAction() == 3) {
                            yp40Var3.a = false;
                            yp40Var4.a = false;
                        }
                    } else if (action == 2) {
                        float rawX = motionEvent.getRawX();
                        aq40Var3.a = rawX;
                        float f3 = rawX - aq40Var4.a;
                        if (Math.abs(f3) > 10.0f && z640Var.A) {
                            yp40Var3.a = true;
                        }
                        if (yp40Var3.a) {
                            if (!yp40Var4.a) {
                                z640Var.f.invoke(z640Var);
                                yp40Var4.a = true;
                            }
                            constraintLayout2.setTranslationX(Math.min(aq40Var5.a + f3, 0.0f));
                        }
                    } else if (action == 3) {
                        if (yp40Var3.a) {
                            float width2 = constraintLayout2.getWidth();
                            f = 0.25f * width2;
                            f2 = width2 * 0.5f;
                            if (!z640Var.B) {
                                z640Var.v.invoke();
                                z640Var.c();
                            } else if (constraintLayout2.getTranslationX() > aq40Var5.a) {
                                z640Var.c();
                            } else if (constraintLayout2.getTranslationX() < (-f2)) {
                                numA = z640.a(z640Var);
                                if (numA != null) {
                                    z640Var.i.invoke(numA);
                                }
                                jjd0Var2.V.animate().translationX(-jjd0Var2.V.getWidth()).setDuration(200L).start();
                            } else if (constraintLayout2.getTranslationX() < (-f)) {
                                jjd0Var2.V.animate().translationX(-bqe.b(64.0f, z640Var.z)).setDuration(200L).start();
                            } else {
                                z640Var.c();
                            }
                            yp40Var4.a = false;
                        }
                        if (motionEvent.getAction() == 3) {
                            yp40Var3.a = false;
                            yp40Var4.a = false;
                        }
                    }
                } else {
                    aq40Var4.a = motionEvent.getRawX();
                    aq40Var5.a = constraintLayout2.getTranslationX();
                    yp40Var3.a = false;
                }
                if (!yp40Var3.a) {
                    gestureDetector.onTouchEvent(motionEvent);
                }
                return true;
            }
        });
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: x640
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z640 z640Var = this.a;
                Integer numA = z640.a(z640Var);
                if (numA != null) {
                    z640Var.i.invoke(numA);
                }
                jjd0 jjd0Var2 = z640Var.b;
                jjd0Var2.V.animate().translationX(-jjd0Var2.V.getWidth()).setDuration(200L).start();
            }
        });
    }

    public static Integer a(RecyclerView.d0 d0Var) {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            bVar = Integer.valueOf(d0Var.getBindingAdapterPosition());
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        return (Integer) bVar;
    }

    public final void b(boolean z) {
        jjd0 jjd0Var = this.b;
        if (jjd0Var.V.getTranslationX() == 0.0f) {
            return;
        }
        if (z) {
            c();
        } else {
            jjd0Var.V.setTranslationX(0.0f);
        }
    }

    public final void c() {
        this.b.V.animate().translationX(0.0f).setDuration(200L).start();
    }
}
