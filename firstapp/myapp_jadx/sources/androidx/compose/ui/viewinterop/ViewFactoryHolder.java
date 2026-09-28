package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.platform.AbstractComposeView;
import defpackage.glx;
import defpackage.mma;
import defpackage.mt60;
import defpackage.n7i0;
import defpackage.qlr;
import defpackage.wgz;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR(\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010RB\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018RB\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018RB\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u0014\u0010$\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "Landroid/view/View;", "T", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "", "Lglx;", "Q", "Lglx;", "getDispatcher", "()Lglx;", "dispatcher", "Lmt60$a;", "value", "S", "Lmt60$a;", "setSavableRegistryEntry", "(Lmt60$a;)V", "savableRegistryEntry", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "getUpdateBlock", "()Lkotlin/jvm/functions/Function1;", "setUpdateBlock", "(Lkotlin/jvm/functions/Function1;)V", "updateBlock", "U", "getResetBlock", "setResetBlock", "resetBlock", "V", "getReleaseBlock", "setReleaseBlock", "releaseBlock", "getViewRoot", "()Landroid/view/View;", "viewRoot", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder {
    public final T P;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public final glx dispatcher;
    public final mt60 R;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public mt60.a savableRegistryEntry;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public Function1<? super T, Unit> updateBlock;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public Function1<? super T, Unit> resetBlock;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public Function1<? super T, Unit> releaseBlock;

    public static final class a extends qlr implements Function0<Unit> {
        public final /* synthetic */ ViewFactoryHolder<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.a = viewFactoryHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ViewFactoryHolder<T> viewFactoryHolder = this.a;
            viewFactoryHolder.getReleaseBlock().invoke(viewFactoryHolder.P);
            viewFactoryHolder.i();
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function0<Unit> {
        public final /* synthetic */ ViewFactoryHolder<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.a = viewFactoryHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ViewFactoryHolder<T> viewFactoryHolder = this.a;
            viewFactoryHolder.getResetBlock().invoke(viewFactoryHolder.P);
            return Unit.a;
        }
    }

    public static final class c extends qlr implements Function0<Unit> {
        public final /* synthetic */ ViewFactoryHolder<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.a = viewFactoryHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ViewFactoryHolder<T> viewFactoryHolder = this.a;
            viewFactoryHolder.getUpdateBlock().invoke(viewFactoryHolder.P);
            return Unit.a;
        }
    }

    public ViewFactoryHolder() {
        throw null;
    }

    public ViewFactoryHolder(Context context, Function1<? super Context, ? extends T> function1, mma mmaVar, mt60 mt60Var, int i, wgz wgzVar) {
        T tInvoke = function1.invoke(context);
        glx glxVar = new glx();
        super(context, mmaVar, i, glxVar, tInvoke, wgzVar);
        this.P = tInvoke;
        this.dispatcher = glxVar;
        this.R = mt60Var;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objE = mt60Var != null ? mt60Var.e(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objE instanceof SparseArray ? (SparseArray) objE : null;
        if (sparseArray != null) {
            tInvoke.restoreHierarchyState(sparseArray);
        }
        if (mt60Var != null) {
            setSavableRegistryEntry(mt60Var.b(strValueOf, new n7i0(this)));
        }
        androidx.compose.ui.viewinterop.b.h hVar = androidx.compose.ui.viewinterop.b.a;
        this.updateBlock = hVar;
        this.resetBlock = hVar;
        this.releaseBlock = hVar;
    }

    private final void setSavableRegistryEntry(mt60.a aVar) {
        mt60.a aVar2 = this.savableRegistryEntry;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.savableRegistryEntry = aVar;
    }

    public final glx getDispatcher() {
        return this.dispatcher;
    }

    public final Function1<T, Unit> getReleaseBlock() {
        return this.releaseBlock;
    }

    public final Function1<T, Unit> getResetBlock() {
        return this.resetBlock;
    }

    public /* bridge */ /* synthetic */ AbstractComposeView getSubCompositionView() {
        return null;
    }

    public final Function1<T, Unit> getUpdateBlock() {
        return this.updateBlock;
    }

    public View getViewRoot() {
        return this;
    }

    public final void i() {
        setSavableRegistryEntry(null);
    }

    public final void setReleaseBlock(Function1<? super T, Unit> function1) {
        this.releaseBlock = function1;
        setRelease(new a(this));
    }

    public final void setResetBlock(Function1<? super T, Unit> function1) {
        this.resetBlock = function1;
        setReset(new b(this));
    }

    public final void setUpdateBlock(Function1<? super T, Unit> function1) {
        this.updateBlock = function1;
        setUpdate(new c(this));
    }
}
