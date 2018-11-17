//package com.example.chris.sleepearily;
//
//import android.content.Context;
//import android.content.res.TypedArray;
//import android.text.TextUtils;
//import android.util.AttributeSet;
//import android.widget.TextView;
//import android.support.v7.widget.AppCompatTextView;
//
//public class FontType {
//
//    /**
//     * Created by Administrator on 2015/10/27.
//     */
//    public class FontTextView extends AppCompatTextView {
//        /** The file name of the font data in the assets directory*/
//        private String mFontPath = "font/HanYiYanKaiW-2.ttf";
//
//        public FontTextView(Context context) {
//            super(context);
//            init(context, null, 0);
//        }
//        public FontTextView(Context context, AttributeSet attrs) {
//            super(context, attrs);
//            init(context, attrs, 0);
//        }
//        public FontTextView(Context context, AttributeSet attrs, int defStyleAttr) {
//            super(context, attrs, defStyleAttr);
//            init(context, attrs, defStyleAttr);
//        }
//
//        public String getFontPath() {
//            return mFontPath;
//        }
//
//        /**
//         * <p>Set font file fontPath</p>
//         * @param fontPath The file name of the font data in the assets directory
//         */
//        public void setFontPath(String fontPath) {
//            mFontPath = fontPath;
//
//            if (!TextUtils.isEmpty(mFontPath)) {
//                FontUtils.getInstance().replaceFontFromAsset(this, mFontPath);
//            }
//        }
//
//        private void init(Context context, AttributeSet attrs, int defStyleAttr) {
////            TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable, defStyleAttr, 0);
//            mFontPath = typedArray.getString(R.styleable.FontTextView_font_path);
//            typedArray.recycle();
//
//            if (!TextUtils.isEmpty(mFontPath)) {
//                FontUtils.getInstance().replaceFontFromAsset(this, mFontPath);
//            }
//        }
//    }
//}
