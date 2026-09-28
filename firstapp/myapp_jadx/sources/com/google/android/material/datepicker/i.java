package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.cpy;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView a;
    public final /* synthetic */ j b;

    public i(j jVar, MaterialCalendarGridView materialCalendarGridView) {
        this.b = jVar;
        this.a = materialCalendarGridView;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.a;
        h hVarA = materialCalendarGridView.a();
        if (i < hVarA.b() || i > hVarA.d()) {
            return;
        }
        c.C0195c c0195c = this.b.d;
        long jLongValue = materialCalendarGridView.a().getItem(i).longValue();
        c cVar = c.this;
        if (cVar.d.c.f0(jLongValue)) {
            cVar.c.C1(jLongValue);
            Iterator it = cVar.a.iterator();
            while (it.hasNext()) {
                ((cpy) it.next()).b(cVar.c.w1());
            }
            cVar.y.getAdapter().notifyDataSetChanged();
            RecyclerView recyclerView = cVar.w;
            if (recyclerView != null) {
                recyclerView.getAdapter().notifyDataSetChanged();
            }
        }
    }
}
