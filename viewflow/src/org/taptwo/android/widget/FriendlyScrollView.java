//  FriendlyScrollView.java
//	This scrollview has a boolean which, when false, disables touch
//	interception.
//
//	IMPORTANT: This toggle is handled completely from outside the view
//	vertical scrolling must be reenabled again at some point in the future.
//
//  Created by Tim Wicksteed on 24/02/2013.
//  Copyright (c) 2013 Tim Wicksteed. All rights reserved.

package org.taptwo.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class FriendlyScrollView extends ScrollView {

	private boolean enabled = true;

	// DEFAULT CONSTRUCTORS
	public FriendlyScrollView(Context context) {
		super(context);
	}

	public FriendlyScrollView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public FriendlyScrollView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	// TOUCH INTERCEPTION
	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		if (enabled) {
			return super.onInterceptTouchEvent(ev);
		} else
			return false;
	}

	// SCROLLING TOGGLE
	public void disableVerticalScrolled() {
		enabled = false;
	}

	public void enableVerticalScrolled() {
		enabled = true;
	}

}
