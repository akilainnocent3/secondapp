package com.sportybet.android.instantwin.presentation.widget.viewholder;

import android.view.View;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.widget.OutcomeSpinnerLayout;
import defpackage.b5v;
import defpackage.bs3;
import defpackage.crg;
import defpackage.h8z;
import defpackage.ogo;
import defpackage.spu;
import defpackage.tlo;
import defpackage.u4v;
import defpackage.uho;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public class MatchEventSpinnerViewHolder extends BaseViewHolder {
    private final OutcomeSpinnerLayout<bs3> outcomeSpinnerLayout;
    private final tlo sharedData;

    public class a implements OutcomeSpinnerLayout.b<bs3> {
        public u4v a;
    }

    public class b implements View.OnClickListener {
        public crg a;

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b5v b5vVar;
            crg crgVar = this.a;
            u4v u4vVar = crgVar.g;
            if (u4vVar == null || (b5vVar = u4vVar.a.B) == null) {
                return;
            }
            b5vVar.J(crgVar);
        }
    }

    public MatchEventSpinnerViewHolder(View view, tlo tloVar) {
        super(view);
        this.outcomeSpinnerLayout = (OutcomeSpinnerLayout) view.findViewById(R.id.outcome_layout);
        this.sharedData = tloVar;
    }

    private static String[] getSubTitles(String str) {
        try {
            return str.split(";");
        } catch (Exception unused) {
            return null;
        }
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
    public void setData(final crg crgVar, ogo ogoVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = crgVar.b;
        String str = crgVar.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            int i2 = i + 1;
            spu spuVar = (spu) obj;
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            LinkedHashMap linkedHashMap = spuVar.f;
            ArrayList arrayList10 = arrayList2;
            String str2 = spuVar.a;
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                int i3 = size;
                h8z h8zVar = (h8z) it.next();
                Iterator it2 = it;
                int i4 = i2;
                String str3 = h8zVar.a;
                boolean z = h8zVar.d;
                String str4 = h8zVar.b;
                arrayList3.add(new bs3(str, str2, str3));
                arrayList4.add(str4);
                arrayList5.add(h8zVar.g);
                arrayList6.add(Boolean.valueOf(z));
                arrayList7.add(Boolean.valueOf(h8zVar.e));
                tlo tloVar = this.sharedData;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                String str5 = str;
                sb.append("-");
                sb.append(str2);
                sb.append("-");
                sb.append(h8zVar.a);
                boolean z2 = true;
                arrayList8.add(Boolean.valueOf(tloVar.q(sb.toString()) != null));
                if (!uho.b(str4, ogoVar) || !z) {
                    z2 = false;
                }
                arrayList9.add(Boolean.valueOf(z2));
                it = it2;
                size = i3;
                i2 = i4;
                str = str5;
            }
            String str6 = str;
            int i5 = size;
            int i6 = i2;
            String[] subTitles = getSubTitles(spuVar.e);
            String str7 = (subTitles == null || subTitles.length <= 0) ? "" : subTitles[0];
            OutcomeSpinnerLayout.d dVar = new OutcomeSpinnerLayout.d();
            dVar.a = arrayList3;
            dVar.b = arrayList4;
            dVar.c = arrayList5;
            dVar.h = str7;
            dVar.d = arrayList6;
            dVar.e = arrayList7;
            dVar.f = arrayList8;
            dVar.g = arrayList9;
            arrayList.add(dVar);
            arrayList2 = arrayList10;
            size = i5;
            i = i6;
            str = str6;
        }
        OutcomeSpinnerLayout<bs3> outcomeSpinnerLayout = this.outcomeSpinnerLayout;
        int i7 = crgVar.d;
        a aVar = new a();
        u4v u4vVar = crgVar.g;
        if (u4vVar != null) {
            aVar.a = u4vVar;
        }
        outcomeSpinnerLayout.setData(i7, arrayList, aVar);
        this.outcomeSpinnerLayout.setSpannerListener(new OutcomeSpinnerLayout.c() { // from class: h5v
            @Override // com.sportybet.android.instantwin.presentation.widget.OutcomeSpinnerLayout.c
            public final void a(int i8) {
                crgVar.d = i8;
            }
        });
        View view = this.itemView;
        b bVar = new b();
        bVar.a = crgVar;
        view.setOnClickListener(bVar);
    }
}
