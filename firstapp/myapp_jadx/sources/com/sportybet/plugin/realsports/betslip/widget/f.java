package com.sportybet.plugin.realsports.betslip.widget;

import java.util.HashSet;
import java.util.Stack;

/* JADX INFO: loaded from: classes7.dex */
public final class f {
    public static final HashSet<a> a = new HashSet<>();
    public static final Stack<a> b = new Stack<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final /* synthetic */ a[] f;

        static {
            a aVar = new a("None", 0);
            a = aVar;
            a aVar2 = new a("HowToPlay", 1);
            b = aVar2;
            a aVar3 = new a("BetHistory", 2);
            c = aVar3;
            a aVar4 = new a("Results", 3);
            d = aVar4;
            a aVar5 = new a("Running", 4);
            e = aVar5;
            f = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f.clone();
        }
    }

    public static void a(a aVar) {
        HashSet<a> hashSet = a;
        boolean zContains = hashSet.contains(aVar);
        Stack<a> stack = b;
        if (zContains) {
            stack.remove(aVar);
            stack.push(aVar);
        } else {
            stack.push(aVar);
            hashSet.add(aVar);
        }
    }

    public static void b(a aVar) {
        Stack<a> stack = b;
        if (stack.isEmpty()) {
            return;
        }
        HashSet<a> hashSet = a;
        if (hashSet.contains(aVar)) {
            stack.remove(aVar);
            hashSet.remove(aVar);
        }
    }
}
