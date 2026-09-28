package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes8.dex */
public final class t6i0 implements i1k<Object> {
    public volatile pmc a;
    public final Object b = new Object();
    public final View c;

    public interface b {
        omc I0();
    }

    public t6i0(View view) {
        this.c = view;
    }

    public final pmc a() {
        View view = this.c;
        Context context = view.getContext();
        while ((context instanceof ContextWrapper) && !i1k.class.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        Application applicationA = p1b.a(context.getApplicationContext());
        Object obj = context;
        if (context == applicationA) {
            z7b.c(false, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", view.getClass());
            obj = null;
        }
        if (obj instanceof i1k) {
            omc omcVarI0 = ((b) jm2.a((i1k) obj, b.class)).I0();
            view.getClass();
            omcVarI0.c = view;
            return new pmc(omcVarI0.a, omcVarI0.b);
        }
        throw new IllegalStateException(view.getClass() + ", Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.");
    }

    @Override // defpackage.i1k
    public final Object generatedComponent() {
        if (this.a == null) {
            synchronized (this.b) {
                try {
                    if (this.a == null) {
                        this.a = a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.a;
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a extends ContextWrapper {
        public LayoutInflater a;
        public LayoutInflater b;

        /* JADX INFO: renamed from: t6i0$a$a, reason: collision with other inner class name */
        public class C1116a implements cbs {
            public C1116a() {
            }

            @Override // defpackage.cbs
            public final void F0(ibs ibsVar, s9s.a aVar) {
                if (aVar == s9s.a.ON_DESTROY) {
                    a aVar2 = a.this;
                    aVar2.a = null;
                    aVar2.b = null;
                }
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(LayoutInflater layoutInflater, Fragment fragment) {
            layoutInflater.getClass();
            Context context = layoutInflater.getContext();
            context.getClass();
            super(context);
            C1116a c1116a = new C1116a();
            this.a = layoutInflater;
            fragment.getClass();
            fragment.getLifecycle().a(c1116a);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            LayoutInflater layoutInflater = this.b;
            if (layoutInflater != null) {
                return layoutInflater;
            }
            LayoutInflater layoutInflater2 = this.a;
            if (layoutInflater2 == null) {
                layoutInflater2 = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                this.a = layoutInflater2;
            }
            LayoutInflater layoutInflaterCloneInContext = layoutInflater2.cloneInContext(this);
            this.b = layoutInflaterCloneInContext;
            return layoutInflaterCloneInContext;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Fragment fragment) {
            super(context);
            context.getClass();
            C1116a c1116a = new C1116a();
            this.a = null;
            fragment.getClass();
            fragment.getLifecycle().a(c1116a);
        }
    }
}
