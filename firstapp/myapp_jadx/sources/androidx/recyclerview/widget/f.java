package androidx.recyclerview.widget;

import android.util.Log;
import android.view.ViewGroup;
import defpackage.dy5;
import defpackage.nke;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f extends RecyclerView.f<RecyclerView.d0> {
    public final g a;

    @SafeVarargs
    public f(RecyclerView.f<? extends RecyclerView.d0>... fVarArr) {
        List listAsList = Arrays.asList(fVarArr);
        this.a = new g(this);
        Iterator it = listAsList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                this.a.getClass();
                super.setHasStableIds(false);
                return;
            }
            RecyclerView.f<RecyclerView.d0> fVar = (RecyclerView.f) it.next();
            g gVar = this.a;
            ArrayList arrayList = gVar.e;
            int size = arrayList.size();
            if (size < 0 || size > arrayList.size()) {
                throw new IndexOutOfBoundsException("Index must be between 0 and " + arrayList.size() + ". Given:" + size);
            }
            if (fVar.hasStableIds()) {
                Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
            }
            int size2 = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    i2 = -1;
                    break;
                } else if (((y) arrayList.get(i2)).c == fVar) {
                    break;
                } else {
                    i2++;
                }
            }
            if ((i2 == -1 ? null : (y) arrayList.get(i2)) == null) {
                y yVar = new y(fVar, gVar, gVar.b, gVar.g.a());
                arrayList.add(size, yVar);
                ArrayList arrayList2 = gVar.c;
                int size3 = arrayList2.size();
                while (i < size3) {
                    Object obj = arrayList2.get(i);
                    i++;
                    RecyclerView recyclerView = (RecyclerView) ((WeakReference) obj).get();
                    if (recyclerView != null) {
                        fVar.onAttachedToRecyclerView(recyclerView);
                    }
                }
                if (yVar.e > 0) {
                    gVar.a.notifyItemRangeInserted(gVar.b(yVar), yVar.e);
                }
                gVar.a();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int findRelativeAdapterPositionIn(RecyclerView.f<? extends RecyclerView.d0> fVar, RecyclerView.d0 d0Var, int i) {
        g gVar = this.a;
        y yVar = gVar.d.get(d0Var);
        if (yVar == null) {
            return -1;
        }
        RecyclerView.f<RecyclerView.d0> fVar2 = yVar.c;
        int iB = i - gVar.b(yVar);
        int itemCount = fVar2.getItemCount();
        if (iB >= 0 && iB < itemCount) {
            return fVar2.findRelativeAdapterPositionIn(fVar, d0Var, iB);
        }
        StringBuilder sbA = dy5.a("Detected inconsistent adapter updates. The local position of the view holder maps to ", iB, itemCount, " which is out of bounds for the adapter with size ", ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        sbA.append(d0Var);
        sbA.append("adapter:");
        sbA.append(fVar);
        throw new IllegalStateException(sbA.toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        ArrayList arrayList = this.a.e;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            i += ((y) obj).e;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final long getItemId(int i) {
        g gVar = this.a;
        g.a aVarC = gVar.c(i);
        y yVar = aVarC.a;
        long jA = yVar.b.a(yVar.c.getItemId(aVarC.b));
        aVarC.c = false;
        aVarC.a = null;
        aVarC.b = -1;
        gVar.f = aVarC;
        return jA;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        g gVar = this.a;
        g.a aVarC = gVar.c(i);
        y yVar = aVarC.a;
        int iB = yVar.a.b(yVar.c.getItemViewType(aVarC.b));
        aVarC.c = false;
        aVarC.a = null;
        aVarC.b = -1;
        gVar.f = aVarC;
        return iB;
    }

    public final void i(RecyclerView.f.a aVar) {
        super.setStateRestorationPolicy(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        g gVar = this.a;
        ArrayList arrayList = gVar.c;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (((WeakReference) obj).get() == recyclerView) {
                return;
            }
        }
        arrayList.add(new WeakReference(recyclerView));
        ArrayList arrayList2 = gVar.e;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            ((y) obj2).c.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        g gVar = this.a;
        g.a aVarC = gVar.c(i);
        gVar.d.put(d0Var, aVarC.a);
        y yVar = aVarC.a;
        yVar.c.bindViewHolder(d0Var, aVarC.b);
        aVarC.c = false;
        aVarC.a = null;
        aVarC.b = -1;
        gVar.f = aVarC;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        y yVarA = this.a.b.a(i);
        return yVarA.c.onCreateViewHolder(viewGroup, yVarA.a.a(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        g gVar = this.a;
        ArrayList arrayList = gVar.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            if (weakReference.get() != null) {
                if (weakReference.get() == recyclerView) {
                    arrayList.remove(size);
                    break;
                }
            } else {
                arrayList.remove(size);
            }
        }
        ArrayList arrayList2 = gVar.e;
        int size2 = arrayList2.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            ((y) obj).c.onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final boolean onFailedToRecycleView(RecyclerView.d0 d0Var) {
        g gVar = this.a;
        IdentityHashMap<RecyclerView.d0, y> identityHashMap = gVar.d;
        y yVar = identityHashMap.get(d0Var);
        if (yVar == null) {
            nke.a(d0Var, "Cannot find wrapper for ", ", seems like it is not bound by this adapter: ", gVar);
            return false;
        }
        boolean zOnFailedToRecycleView = yVar.c.onFailedToRecycleView(d0Var);
        identityHashMap.remove(d0Var);
        return zOnFailedToRecycleView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onViewAttachedToWindow(RecyclerView.d0 d0Var) {
        this.a.d(d0Var).c.onViewAttachedToWindow(d0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onViewDetachedFromWindow(RecyclerView.d0 d0Var) {
        this.a.d(d0Var).c.onViewDetachedFromWindow(d0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onViewRecycled(RecyclerView.d0 d0Var) {
        g gVar = this.a;
        IdentityHashMap<RecyclerView.d0, y> identityHashMap = gVar.d;
        y yVar = identityHashMap.get(d0Var);
        if (yVar == null) {
            nke.a(d0Var, "Cannot find wrapper for ", ", seems like it is not bound by this adapter: ", gVar);
        } else {
            yVar.c.onViewRecycled(d0Var);
            identityHashMap.remove(d0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void setStateRestorationPolicy(RecyclerView.f.a aVar) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }
}
