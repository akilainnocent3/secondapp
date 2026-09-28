package com.sportygames.redblack.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import defpackage.mwo;
import defpackage.tk30;
import defpackage.w6s;
import defpackage.zvo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/sportygames/redblack/components/LevelIndicator;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "currentTurn", "", "setCurrentTurn", "(Ljava/lang/Integer;)V", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LevelIndicator extends LinearLayout {
    public final RecyclerView a;
    public final ArrayList<a> b;

    public static final class a {
        public int a;
        public boolean b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "TurnDetail(turn=" + this.a + ", isDone=" + this.b + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View.inflate(context, R.layout.redblack_level_indicator, this);
        View viewFindViewById = findViewById(R.id.indicator_list);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.a = recyclerView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tk30.i);
        typedArrayObtainStyledAttributes.getClass();
        int integer = typedArrayObtainStyledAttributes.getInteger(1, 5);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(0, 1);
        this.b = new ArrayList<>(integer);
        Iterator<Integer> it = f.n(0, integer).iterator();
        while (((mwo) it).c) {
            int iNextInt = ((zvo) it).nextInt();
            ArrayList<a> arrayList = this.b;
            if (arrayList == null) {
                Intrinsics.n("arrayListItems");
                throw null;
            }
            boolean z = iNextInt <= integer2;
            a aVar = new a();
            aVar.a = iNextInt;
            aVar.b = z;
            arrayList.add(aVar);
        }
        Context context2 = getContext();
        context2.getClass();
        ArrayList<a> arrayList2 = this.b;
        if (arrayList2 == null) {
            Intrinsics.n("arrayListItems");
            throw null;
        }
        recyclerView.setAdapter(new w6s(context2, arrayList2));
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setCurrentTurn(Integer currentTurn) {
        if (currentTurn == null) {
            return;
        }
        RecyclerView.f adapter = this.a.getAdapter();
        adapter.getClass();
        w6s w6sVar = (w6s) adapter;
        int iIntValue = currentTurn.intValue();
        w6sVar.c = 0;
        ArrayList<a> arrayList = w6sVar.b;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            a aVar = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            arrayList.get(i).b = aVar.a <= iIntValue;
            w6sVar.notifyItemChanged(i);
            i = i3;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelIndicator(Context context) {
        this(context, null);
        context.getClass();
    }
}
