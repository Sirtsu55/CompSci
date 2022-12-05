#include <cmath>
#include <iostream>
#include <limits>
#include <sstream>
#include <string>
#include <vector>

struct Square {
    double x1, y1, x2, y2;
};

int main() {
    std::cin.sync_with_stdio(false);
    std::ios_base::sync_with_stdio(false);
    std::cin.tie(NULL);
    int n;
    std::cin >> n;
    std::vector<Square> squares;
    squares.reserve(n);

    for (int i = 0; i < n; i++) {
        Square v;

        std::cin >> v.x1 >> v.y1 >> v.x2 >> v.y2;
        squares.emplace_back(v);
    }
    double areaCovered = 0;
    for (auto& i : squares)
    {
        auto x = abs(i.x1 - i.x2);
        auto y = abs(i.y1 - i.y2);
        areaCovered += x*y;
    }
    
    std::cout << areaCovered;

}