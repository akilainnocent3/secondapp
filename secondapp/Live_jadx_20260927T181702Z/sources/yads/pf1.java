package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv f153915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53 f153916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nf1 f153917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f153918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f153919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f153920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f153921g;

    public pf1(Looper looper, xv xvVar, nf1 nf1Var) {
        this(new CopyOnWriteArraySet(), looper, xvVar, nf1Var);
    }

    public final void a() {
        if (this.f153920f.isEmpty()) {
            return;
        }
        if (!this.f153916b.f150440a.hasMessages(0)) {
            i53 i53Var = this.f153916b;
            i53Var.getClass();
            h53 h53VarA = i53.a();
            Message messageObtainMessage = i53Var.f150440a.obtainMessage(0);
            h53VarA.f149941a = messageObtainMessage;
            Handler handler = i53Var.f150440a;
            messageObtainMessage.getClass();
            handler.sendMessageAtFrontOfQueue(messageObtainMessage);
            h53VarA.a();
        }
        boolean zIsEmpty = this.f153919e.isEmpty();
        this.f153919e.addAll(this.f153920f);
        this.f153920f.clear();
        if (zIsEmpty) {
            while (!this.f153919e.isEmpty()) {
                ((Runnable) this.f153919e.peekFirst()).run();
                this.f153919e.removeFirst();
            }
        }
    }

    public pf1(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, xv xvVar, nf1 nf1Var) {
        this.f153915a = xvVar;
        this.f153918d = copyOnWriteArraySet;
        this.f153917c = nf1Var;
        this.f153919e = new ArrayDeque();
        this.f153920f = new ArrayDeque();
        this.f153916b = ((f53) xvVar).a(looper, new Handler.Callback() { // from class: yads.d84
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f148094b.a(message);
            }
        });
    }

    public final boolean a(Message message) {
        for (of1 of1Var : this.f153918d) {
            nf1 nf1Var = this.f153917c;
            if (!of1Var.f153478d && of1Var.f153477c) {
                dw0 dw0VarA = of1Var.f153476b.a();
                of1Var.f153476b = new cw0();
                of1Var.f153477c = false;
                nf1Var.a(of1Var.f153475a, dw0VarA);
            }
            if (this.f153916b.f150440a.hasMessages(0)) {
                return true;
            }
        }
        return true;
    }

    public static void a(CopyOnWriteArraySet copyOnWriteArraySet, int i10, mf1 mf1Var) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            of1 of1Var = (of1) it.next();
            if (!of1Var.f153478d) {
                if (i10 != -1) {
                    of1Var.f153476b.a(i10);
                }
                of1Var.f153477c = true;
                mf1Var.invoke(of1Var.f153475a);
            }
        }
    }

    public final void a(final int i10, final mf1 mf1Var) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f153918d);
        this.f153920f.add(new Runnable() { // from class: yads.e84
            @Override // java.lang.Runnable
            public final void run() {
                pf1.a(copyOnWriteArraySet, i10, mf1Var);
            }
        });
    }
}
