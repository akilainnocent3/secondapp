package com.ironsource;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface G7 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayList<C5> f59058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f59059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f59060c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Exception f59061d;

        public a(ArrayList<C5> arrayList) {
            this.f59059b = false;
            this.f59060c = -1;
            this.f59058a = arrayList;
        }

        public a a(Exception exc) {
            return new a(this.f59058a, this.f59060c, this.f59059b, exc);
        }

        public ArrayList<C5> b() {
            return this.f59058a;
        }

        public boolean c() {
            return this.f59059b;
        }

        public String toString() {
            return "EventSendResult{success=" + this.f59059b + ", responseCode=" + this.f59060c + ", exception=" + this.f59061d + fw.b.f85383j;
        }

        public a a(boolean z10) {
            return new a(this.f59058a, this.f59060c, z10, this.f59061d);
        }

        public a a(int i10) {
            return new a(this.f59058a, i10, this.f59059b, this.f59061d);
        }

        public String a() {
            if (this.f59059b) {
                return "";
            }
            return "rc=" + this.f59060c + ", ex=" + this.f59061d;
        }

        public a(ArrayList<C5> arrayList, int i10, boolean z10, Exception exc) {
            this.f59058a = arrayList;
            this.f59059b = z10;
            this.f59061d = exc;
            this.f59060c = i10;
        }
    }

    void a(a aVar);
}
